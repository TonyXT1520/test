package com.example.test_2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "date_of_birth")
    private String dayofBirth;
    @Column(name = "gender")
    private String address;
    @Column(name = "address")
    private String gender;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
}
