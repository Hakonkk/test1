package com.example.sergpetproject.controllers;

import com.example.sergpetproject.integration.dto.Person;
import com.example.sergpetproject.integration.entity.PersonEntity;
import com.example.sergpetproject.service.RandomApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/person")
@RequiredArgsConstructor
public class RandomApiController {
    private final RandomApiService randomApiService;

    @GetMapping("/getAll")
    public List<Person> getPersons(){
        return randomApiService.getPersonList(); // get
    }

    @PostMapping("/saveAll")
    @Transactional
    public ResponseEntity<List<PersonEntity>> createPersons() {
        List<PersonEntity> savedPersons = randomApiService.saveAllPersons();
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPersons);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deletePerson(@PathVariable Long id){
        randomApiService.deletePersonById(id);
        return ResponseEntity.ok().build();
    }
}
