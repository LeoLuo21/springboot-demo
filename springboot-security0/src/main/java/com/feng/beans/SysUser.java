package com.feng.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SysUser {
    private Integer id;
    private String username;
    private String password;
    private List<SysRole> roles;
}
