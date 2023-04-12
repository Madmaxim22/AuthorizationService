package com.example.authorizationservice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
    
    @NotBlank
    private String name;
    @Size(min = 4, max = 10)
    @NotNull
    private String password;
    
    public User() {
    }
    
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
