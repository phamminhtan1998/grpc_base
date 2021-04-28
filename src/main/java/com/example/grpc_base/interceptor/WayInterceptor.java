package com.example.grpc_base.interceptor;


import com.example.grpc_base.model.WayScopedBean;
import io.grpc.*;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import io.grpc.Metadata.Key;
@Slf4j
@GrpcGlobalServerInterceptor
public class WayInterceptor implements ServerInterceptor {
    private final Key<String> id;
    private final Key<String> name;
    private final Key<String> description;
    private final Key<String> idPerson;
    private final Key<String> location;
    private final Key<String> newWayType;
    private final WayScopedBean scopedBean;


    public WayInterceptor(WayScopedBean wayScopedBean) {
        this.id =Key.of("id",Metadata.ASCII_STRING_MARSHALLER);
        this.name = Key.of("name",Metadata.ASCII_STRING_MARSHALLER);
        this.description = Key.of("description",Metadata.ASCII_STRING_MARSHALLER);
        this.idPerson = Key.of("idPerson",Metadata.ASCII_STRING_MARSHALLER);
        this.location = Key.of("location",Metadata.ASCII_STRING_MARSHALLER);
        this.newWayType = Key.of("newWayType",Metadata.ASCII_STRING_MARSHALLER);
        this.scopedBean = wayScopedBean;
    }

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        String id = (String)metadata.get(this.id);
        String name = (String)metadata.get(this.name);
        String description = (String)metadata.get(this.description);
        String idPerson = (String)metadata.get(this.idPerson);
        String location = (String)metadata.get(this.location);
        String newWayType = (String)metadata.get(this.newWayType);

        this.scopedBean.setId(id);
        this.scopedBean.setName(name);
        this.scopedBean.setIdPerson(idPerson);
        this.scopedBean.setLocation(location);
        this.scopedBean.setDescription(description);
        this.scopedBean.setNewWayType(newWayType);
        return serverCallHandler.startCall(serverCall,metadata);
    }
}

