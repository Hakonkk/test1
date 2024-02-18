package com.example.sergpetproject.integration.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "location_person")
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "postcode")
    private Integer postCode;
}
