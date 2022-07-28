package com.feng.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Permission {
    private Integer id;
    private String name;
    private String permissionUrl;
    private String method;
    private String description;
}