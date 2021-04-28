package com.example.grpc_base.configuration;

import com.example.grpc_base.model.WayScopedBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration(
        proxyBeanMethods = true
)
public class GrpcConfig {
    public GrpcConfig() {
    }

    @Bean(name = "wayScopeBean")
    @Scope(scopeName = "grpcRequest",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public WayScopedBean wayScopedBean(){
        return new WayScopedBean();
    }
}
