package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public interface StudentService {
    
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student deletedata(Long id);
    Student updatedata(Long id,Student student);
}