package com.example.sergpetproject.integration.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Objects;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "Таблица Локации")
public class Location {
    @Schema(description = "Улица")
    private Street street;
    @Schema(description = "Город", example = "Tunceli", requiredMode = REQUIRED)
    private String city;
    @Schema(description = "Страна", example = "Turkey", requiredMode = REQUIRED)
    private String country;
    @Schema(description = "Индекс", example = "53758")
    private Integer postCode;
}
