package com.example.sergpetproject.integration.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "Таблица Имени")
public class Name {
    @Schema(description = "Мужчина/Женщина(Mr/Miss)", example = "Mr")
    private String title;
    @Schema(description = "Имя", example = "Coşkun", requiredMode = REQUIRED)
    private String first;
    @Schema(description = "Фамилия", example = "Kumcuoğlu", requiredMode = REQUIRED)
    private String last;
}
