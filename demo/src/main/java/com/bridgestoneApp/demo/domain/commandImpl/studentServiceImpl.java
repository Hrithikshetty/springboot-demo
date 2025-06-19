package com.bridgestoneApp.demo.domain.commandImpl;

import com.bridgestoneApp.demo.domain.command.StudentService;
import com.bridgestoneApp.demo.domain.models.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class studentServiceImpl implements StudentService {

    @Override
    public List<Student> queryStudents() {
        List<Student>students = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1);
        s1.setFirstname("hrithik");
        s1.setLastname("shetty");
        s1.setEmail("hrithik@gmail.com");
        s1.setAge(21);
        s1.setGender("Male");
        s1.setGrade("9");

        Student s2 = new Student();
        s2.setId(2);
        s2.setFirstname("kiran");
        s2.setLastname("sharma");
        s2.setEmail("kiran@gmail.com");
        s2.setAge(21);
        s2.setGender("Female");
        s2.setGrade("8");

        return students;
    }
}
