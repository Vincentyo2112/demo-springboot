package com.example.demo2.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    boolean existsByUsernameAndPassword(String username, String password);

    Optional<User> findByUsername(String username);
}
