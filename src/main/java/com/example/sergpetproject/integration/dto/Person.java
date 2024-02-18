package com.example.sergpetproject.integration.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {
   private String gender;
   private Name name;
   private Location location;
   private String phone;

}
