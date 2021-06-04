package com.example.EcommerceApplication.JWT.model;


import java.io.Serializable;

public class JwtRequest implements Serializable {
    private final Long serialVersionUID=5926468583005150707L;
    private String username;
    private String password;

    JwtRequest() {}
    JwtRequest(String username,String password) {
        this.username=username;
        this.password=password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
