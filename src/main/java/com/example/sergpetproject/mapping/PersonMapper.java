package com.example.sergpetproject.mapping;

import com.example.sergpetproject.integration.dto.RandomApiResponse;
import com.example.sergpetproject.integration.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
    PersonEntity toEntity (RandomApiResponse persons);
}
