package com.example.sergpetproject.service;

import com.example.sergpetproject.integration.RandomApiHttpClient;
import com.example.sergpetproject.integration.dto.RandomApiResponse;
import com.example.sergpetproject.integration.entity.PersonEntity;
import com.example.sergpetproject.mapping.PersonMapper;
import com.example.sergpetproject.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;


@Service
@NoArgsConstructor
@AllArgsConstructor
public class RandomApiServiceImpl implements RandomApiService {
    private RandomApiHttpClient randomApiHttpClient;
    private PersonRepository personRepository;

    int randomNum = ThreadLocalRandom.current().nextInt(1, 100);

    @Autowired
    public RandomApiServiceImpl(RandomApiHttpClient randomApiHttpClient, PersonRepository personRepository) {
        this.randomApiHttpClient = randomApiHttpClient;
        this.personRepository = personRepository;
    }

    @Override
    public void saveAllPersons() {
        RandomApiResponse randomPersons = randomApiHttpClient.getRandomPersons(randomNum);
        PersonEntity personEntity = PersonMapper.INSTANCE.toEntity(randomPersons);
        personRepository.save(personEntity);
    }

}
