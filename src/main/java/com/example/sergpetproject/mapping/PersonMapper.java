package com.example.sergpetproject.mapping;

import com.example.sergpetproject.integration.dto.Person;
import com.example.sergpetproject.integration.entity.PersonEntity;
import org.mapstruct.Mapper;


@Mapper
public interface PersonMapper {
    Person toDto (PersonEntity personEntity);
    PersonEntity toEntity (Person personDto);
}
