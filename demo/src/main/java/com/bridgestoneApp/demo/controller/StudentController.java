package com.bridgestoneApp.demo.controller;

import com.bridgestoneApp.demo.domain.command.StudentService;
import com.bridgestoneApp.demo.domain.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService  studentService){
        this.studentService= studentService;
    }

    @GetMapping(path= "/studentName")
        public String studentName(){
            return "hi, my name is hrithik";
    }

    @GetMapping(path= "/students")
    public List<Student> queryStudents(){
        return studentService.queryStudents();
    }
}
