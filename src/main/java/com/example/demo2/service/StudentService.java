package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.model.Student;
import com.example.demo2.repo.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo strepo;
    
    public List<Student> getList() {
        List<Student> list = strepo.findAll();
        return list;
    }

}
