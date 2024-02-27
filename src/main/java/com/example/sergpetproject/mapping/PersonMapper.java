package com.example.sergpetproject.mapping;

import com.example.sergpetproject.integration.dto.Person;
import com.example.sergpetproject.integration.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
    List<PersonEntity> personlistToEntitylist (List<Person> personList);

}
