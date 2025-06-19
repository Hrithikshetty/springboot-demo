package com.bridgestoneApp.demo.domain.command;

import com.bridgestoneApp.demo.domain.models.Student;

import java.util.List;

public interface StudentService {
    public List<Student>queryStudents();
}