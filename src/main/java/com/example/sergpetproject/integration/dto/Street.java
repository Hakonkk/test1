package com.example.sergpetproject.integration.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "Таблица Улицы")
public class Street {
    @Schema(description = "Номер Улицы", example = "66", requiredMode = REQUIRED)
    private Integer number;
    @Schema(description = "Название улицы", example = "Atatürk Sk", requiredMode = REQUIRED)
    private String name;

}
