package com.benefex.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeNo;

    private String title;
    private String firstname;
    private String surname;
    private String dob;
    private String gender;
    private String email;
    private String address;

    public Employee(int employeeNo, String title, String firstname, String surname, String dob, String gender, String email, String address) {
        this.employeeNo = employeeNo;
        this.title = title;
        this.firstname = firstname;
        this.surname = surname;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }
}
