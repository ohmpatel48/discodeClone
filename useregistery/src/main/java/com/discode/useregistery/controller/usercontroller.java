package com.discode.useregistery.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.discode.useregistery.entity.userdetails;
import com.discode.useregistery.service.impl.userserviceimpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class usercontroller {

    userserviceimpl userservice;

    @GetMapping("/{userId}")
    public ResponseEntity<Optional<userdetails>> getUserdetails(@PathVariable String userId) {
        return ResponseEntity.ok(userservice.getUser(userId));
    }

    @GetMapping("/isverified/{userId}")
    public ResponseEntity<Boolean> getisVetifiedEntity(@PathVariable String userId) {
        return ResponseEntity.ok(userservice.isUserVerified(userId));
    }

    @PostMapping("/update")
    public ResponseEntity<userdetails> updateuser(@RequestBody userdetails entity) {
        return ResponseEntity.ok(userservice.updateUser(entity));
    }

    @PostMapping
    public ResponseEntity<userdetails> createuser(@RequestBody userdetails entity) {
        return ResponseEntity.ok(userservice.saveUser(entity));
    }

    @GetMapping("/delete/{userId}")
    public void deleteuser(@PathVariable String userId) {
        userservice.delete_user(userId);
    }

    @GetMapping
    public ResponseEntity<List<userdetails>> getallusers() {
        return ResponseEntity.ok(userservice.getall());
    }

}
