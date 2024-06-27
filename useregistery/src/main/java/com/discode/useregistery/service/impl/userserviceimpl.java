package com.discode.useregistery.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.discode.useregistery.entity.userdetails;
import com.discode.useregistery.repo.userRepo;
import com.discode.useregistery.service.userservice;

@Service
public class userserviceimpl implements userservice {


    userRepo userRepo;

    @Override
    public userdetails saveUser(userdetails user) {
        return userRepo.save(user);
    }

    @Override
    public void delete_user(String userId) {
        userRepo.delete(userRepo.findById(userId).get());
    }

    @Override
    public Optional<userdetails> getUser(String userId) {
        return userRepo.findById(userId);
    }

    @Override
    public List<userdetails> getUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public userdetails updateUser(userdetails user) {
        return userRepo.save(user);
    }

    @Override
    public boolean isUserVerified(String userId) {
        return userRepo.findById(userId).get().is_verified();
    }

    @Override
    public List<userdetails> getall() {
        return userRepo.findAll();
    }

}
