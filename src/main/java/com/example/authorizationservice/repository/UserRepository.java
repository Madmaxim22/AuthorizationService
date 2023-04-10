package com.example.authorizationservice.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("maksim") && password.equals("1234")) {
            return Arrays.asList(Authorities.values());
        }
        return List.of();
    }
}
