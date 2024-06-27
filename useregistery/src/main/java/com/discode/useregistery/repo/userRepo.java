package com.discode.useregistery.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.discode.useregistery.entity.userdetails;

public interface userRepo extends JpaRepository<userdetails, String> {
    List<userdetails> findByEmail(String email);
}
