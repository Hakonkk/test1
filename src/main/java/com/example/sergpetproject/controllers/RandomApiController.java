package com.example.sergpetproject.controllers;

import com.example.sergpetproject.integration.RandomApiHttpClient;
import com.example.sergpetproject.integration.dto.RandomApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/person")
public class RandomApiController {
    final RandomApiResponse randomApiResponse;
    final RandomApiHttpClient randomApiHttpClient;

    public RandomApiController(RandomApiResponse randomApiResponse, RandomApiHttpClient randomApiHttpClient) {
        this.randomApiResponse = randomApiResponse;
        this.randomApiHttpClient = randomApiHttpClient;
    }


}
