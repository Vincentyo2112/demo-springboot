package com.example.demo2.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.model.User;
import com.example.demo2.repo.UserRepo;

@Service
public class LoginService {
    @Autowired
    private UserRepo repo;

    public  User login(String user, String pass) {
        // check login
        // User user = ;///
        if ( user == null || user.isEmpty() ) {
            throw new RuntimeException("enter username please!");
        } else if (pass == null || pass.isEmpty()) {
            throw new RuntimeException("enter password please!");
        } 

        if (!repo.existsByUsernameAndPassword(user, pass)){
            throw new RuntimeException("Wrong username or password!");
        }

        return repo.findByUsername(user).orElseThrow();


        

        
    }
}
