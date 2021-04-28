package com.example.grpc_base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WayScopedBean {
    private String id="1";
    private String name;
    private String description;
    private String idPerson;
    private String location;
    private String newWayType;

}
