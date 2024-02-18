package com.example.sergpetproject.integration.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RandomApiResponse {
    private List<Person> results;
}