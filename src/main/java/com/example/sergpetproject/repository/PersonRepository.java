package com.example.sergpetproject.repository;

import com.example.sergpetproject.integration.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity,Integer> {
}
