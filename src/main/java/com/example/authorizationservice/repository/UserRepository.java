package com.example.authorizationservice.repository;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        // TODO
        return Collections.singletonList(Authorities.READ);
    }
}
