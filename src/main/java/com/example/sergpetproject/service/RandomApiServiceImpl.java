package com.example.sergpetproject.service;

import com.example.sergpetproject.integration.RandomApiHttpClient;
import com.example.sergpetproject.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class RandomApiServiceImpl implements RandomApiService {
    private final RandomApiHttpClient randomApiHttpClient;
    private final PersonRepository personRepository;

    @Override
    public void saveAllPersons() {

    }


}
