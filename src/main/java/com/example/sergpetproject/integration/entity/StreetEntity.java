package com.example.sergpetproject.integration.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "street_location")
public class StreetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "number")
    private Integer number;
    @Column(name = "name")
    private String name;
}
