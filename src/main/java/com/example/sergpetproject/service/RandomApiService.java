package com.example.sergpetproject.service;

import com.example.sergpetproject.integration.dto.Person;
import com.example.sergpetproject.integration.entity.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RandomApiService {
    List<PersonEntity> saveAllPersons();

    public List<Person> getPersonList();

    void deletePersonById(Long id);
}
