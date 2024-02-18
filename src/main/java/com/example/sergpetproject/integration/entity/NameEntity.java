package com.example.sergpetproject.integration.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "name_person")
public class NameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "first")
    private String first;
    @Column(name = "last")
    private String last;
}
