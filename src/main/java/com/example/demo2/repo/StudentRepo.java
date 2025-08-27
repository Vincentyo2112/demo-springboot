package com.example.demo2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
