package com.example.sergpetproject.service;

import com.example.sergpetproject.integration.RandomApiHttpClient;
import com.example.sergpetproject.integration.dto.Person;
import com.example.sergpetproject.integration.dto.RandomApiResponse;
import com.example.sergpetproject.integration.entity.PersonEntity;
import com.example.sergpetproject.mapping.PersonMapper;
import com.example.sergpetproject.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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
    @Transactional
    public List<PersonEntity> saveAllPersons() {
        RandomApiResponse randomPersons = randomApiHttpClient.getRandomPersons(randomNum);
        List<PersonEntity> personEntity = PersonMapper.INSTANCE.personlistToEntitylist(randomPersons.getResults());
        return personRepository.saveAll(personEntity);
    }

    @Override
    public List<Person> getPersonList() {
        RandomApiResponse randomPersons = randomApiHttpClient.getRandomPersons(randomNum);
        return randomPersons.getResults();
    }

    @Override
    public void deletePersonById(Long id) {
        personRepository.deleteById(id);
    }
}
