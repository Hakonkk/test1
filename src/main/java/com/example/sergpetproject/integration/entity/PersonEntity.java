package com.example.sergpetproject.integration.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "gender")
    private String gender;
    @Column(name = "phone")
    private String phone;
}
