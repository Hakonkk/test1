package com.example.sergpetproject.integration;

import com.example.sergpetproject.converter.JsonNodeToRandomApiResponse;
import com.example.sergpetproject.integration.dto.RandomApiResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
@Data
public class RandomApiHttpClient {
    private static final String RANDOM_API_URL = "https://randomuser.me/api/?results=%s";
    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonNodeToRandomApiResponse converter = new JsonNodeToRandomApiResponse();

    public RandomApiResponse getRandomPersons(Integer countPerson) {
        JsonNode jsonNode;
        try {
            URL url = new URL(RANDOM_API_URL.formatted(countPerson));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream inputStream = connection.getInputStream();
            jsonNode = mapper.readTree(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return converter.convert(jsonNode);
    }
}
