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
    public void testSaveAllPersons() {
//        // Создайте моки для randomApiHttpClient, randomApiResponse, personRepository и personEntity
//        RandomApiHttpClient mockRandomApiHttpClient = mock(RandomApiHttpClient.class);
//        RandomApiResponse mockRandomApiResponse = mock(RandomApiResponse.class);
//        PersonRepository mockPersonRepository = mock(PersonRepository.class);
//        PersonEntity mockPersonEntity = mock(PersonEntity.class);
//        int randomNum = 10;
//
//
//        RandomApiServiceImpl personService = new RandomApiServiceImpl(mockRandomApiHttpClient, mockPersonRepository);
//
//        // Задать поведение моков при вызове методов
//        when(mockRandomApiHttpClient.getRandomPersons(randomNum)).thenReturn(mockRandomApiResponse);
//        when(PersonMapper.INSTANCE.personlistToEntitylist(mockRandomApiResponse)).thenReturn(mockPersonEntity);
//
//        // Вызвать метод saveAllPersons
//        personService.saveAllPersons();
//
//        // Проверить, что моки были вызваны с ожидаемыми аргументами
//        verify(mockRandomApiHttpClient).getRandomPersons(randomNum);
//        verify(mockPersonRepository).save(mockPersonEntity);
    }
}






