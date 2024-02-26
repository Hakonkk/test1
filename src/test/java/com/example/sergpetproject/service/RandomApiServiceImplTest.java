package com.example.sergpetproject.service;

import com.example.sergpetproject.integration.RandomApiHttpClient;
import com.example.sergpetproject.integration.dto.RandomApiResponse;
import com.example.sergpetproject.integration.entity.PersonEntity;
import com.example.sergpetproject.mapping.PersonMapper;
import com.example.sergpetproject.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class RandomApiServiceImplTest {
        @Mock
        private RandomApiHttpClient randomApiHttpClient;

        @Mock
        private PersonRepository personRepository;

        @InjectMocks
        private com.example.sergpetproject.service.RandomApiServiceImplTest randomApiService;

        @Test
        public void saveAllPersonsTest() {
            // Arrange
            int randomNum = 42; // любое число от 1 до 100
            RandomApiResponse randomPersons = new RandomApiResponse(); // любой валидный объект RandomApiResponse
            PersonEntity personEntity = new PersonEntity(); // любой валидный объект PersonEntity

            // Стабим поведение заглушек
            when(randomApiHttpClient.getRandomPersons(randomNum)).thenReturn(randomPersons);
            when(PersonMapper.INSTANCE.toEntity(randomPersons)).thenReturn(personEntity);

            // Act
            randomApiService.saveAllPersonsTest();

            // Assert
            verify(randomApiHttpClient).getRandomPersons(randomNum); // проверяем, что вызван метод getRandomPersons с аргументом randomNum
            verify(personRepository).save(personEntity); // проверяем, что вызван метод save с аргументом personEntity
            verifyNoMoreInteractions(randomApiHttpClient, personRepository); // проверяем, что больше не было вызовов на заглушках
        }


}

