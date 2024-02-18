package com.example.sergpetproject.integration.dto;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Location {
    private Street street;
    private String city;
    private String country;
    private Integer postCode;
}
