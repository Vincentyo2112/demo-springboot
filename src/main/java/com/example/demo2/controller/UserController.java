package com.example.demo2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo2.model.User;
import com.example.demo2.service.LoginService;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private LoginService service;

    @GetMapping
    public String user(Model model) {
        model.addAttribute("user", "abcd" );
        return "index";
    }

    @PostMapping("/login")
    @ResponseBody
    public Map<String, Object> login(@RequestParam String user, @RequestParam String pass){
        Map<String, Object> res = new HashMap<>();
        try {
            
            res.put("user", service.login(user, pass));
        } catch (Exception e) {
            res.put("message", e.getMessage());
        }
        return res;
    }

}
