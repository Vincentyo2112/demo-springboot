package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.model.Student;
import com.example.demo2.service.StudentService;
import com.example.demo2.utils.Lib;

import jakarta.servlet.http.HttpServletRequest;



@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService std;
    @GetMapping
    public String student(HttpServletRequest request, Model model) {
        String cookie = Lib.getCookie(request, "user");
        if (cookie == null || cookie.isEmpty()){
            return "index";
        } 
        List<Student> list = std.getList();
        model.addAttribute("student", list);
        return "student";
    }

}
