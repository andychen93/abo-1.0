package com.cl.entity.system;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private int roleCode;
    private String mobilePhone;
}
