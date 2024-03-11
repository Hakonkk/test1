package com.example.sergpetproject.controllers;

import com.example.sergpetproject.integration.dto.Person;
import com.example.sergpetproject.integration.dto.RandomApiResponse;
import com.example.sergpetproject.integration.entity.PersonEntity;
import com.example.sergpetproject.service.RandomApiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/person")
@RequiredArgsConstructor
@Tag(name = "RandomApiController", description = "основные СRUD методы взаимодействия с БД")
public class RandomApiController {
    private final RandomApiService randomApiService;

    @Operation(
            summary = "Генерация Пользователей",
            description = "Генерирует описание пользователей в случайном количестве 0-100"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = RandomApiResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Ошибка в конфигурации"),
            @ApiResponse(responseCode = "404", description = "Запрос не найден"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ErrorResponse.class))})})
    @GetMapping("/getAll")
    public List<Person> getPersons() {
        return randomApiService.getPersonList(); // get
    }

    @Operation(
            summary = "Сохранение пользователей в БД",
            description = "Отрабатывает метод /getAll (генерирует пользователей) после полученный результат сохраняет в БД"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = RandomApiResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Ошибка в конфигурации"),
            @ApiResponse(responseCode = "404", description = "Запрос не найден"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ErrorResponse.class))})})
    @PostMapping("/saveAll")
    public ResponseEntity<List<PersonEntity>> savePersons() {
        List<PersonEntity> savedPersons = randomApiService.saveAllPersons();
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPersons);
    }


    @Operation(
            summary = "Удаление Пользователей",
            description = "Удаляет пользователей по заданному индивидуальному номеру"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = RandomApiResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Ошибка в конфигурации"),
            @ApiResponse(responseCode = "404", description = "Запрос не найден"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content =
                    {@Content(mediaType = "application/json", schema =
                    @Schema(implementation = ErrorResponse.class))})})
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable @Parameter(description = "ID пользователя") Long id) {
        randomApiService.deletePersonById(id);
        return ResponseEntity.ok().build();
    }
}
