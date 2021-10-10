package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/students")
    public List<Student> fetchStudentList(){

        return studentService.fetchStudentList();
    }
}
