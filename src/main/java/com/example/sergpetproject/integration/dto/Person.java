package com.example.sergpetproject.integration.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "Карточка Person")
public class Person {
    @Schema(description = "Пол", example = "male", requiredMode = REQUIRED)
    private String gender;
    @Schema(description = "Имя", requiredMode = REQUIRED)
    private Name name;
    @Schema(description = "Локация", requiredMode = REQUIRED)
    private Location location;
    @Schema(description = "Номер телефона", example = "(676)-455-2793")
    private String phone;
}
