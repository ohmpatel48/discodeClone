package com.discode.useregistery.service;

import java.util.List;
import java.util.Optional;

import com.discode.useregistery.entity.userdetails;

public interface userservice {

    userdetails saveUser(userdetails user);

    void delete_user(String userId);

    Optional<userdetails> getUser(String userId);

    List<userdetails> getUserByEmail(String email);

    userdetails updateUser(userdetails user);

    boolean isUserVerified(String userId);

    List<userdetails> getall();

}
