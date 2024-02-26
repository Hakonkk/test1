package com.example.sergpetproject;

import com.example.sergpetproject.service.RandomApiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SergPetProjectApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SergPetProjectApplication.class, args); пока скрыл для проверки метода
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SergPetProjectApplication.class);
        RandomApiService randomApiService = applicationContext.getBean(RandomApiService.class);
        randomApiService.saveAllPersons();
    }

}
