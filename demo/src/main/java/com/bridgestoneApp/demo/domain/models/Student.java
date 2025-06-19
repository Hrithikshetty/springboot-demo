package com.bridgestoneApp.demo.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private int age;
    private String gender;
    private String grade;
}