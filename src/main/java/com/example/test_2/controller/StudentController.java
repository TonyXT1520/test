package com.example.test_2.controller;

import com.example.test_2.entity.Student;
import com.example.test_2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();

        return students;
    }
}
