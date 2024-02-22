package com.example.sergpetproject.converter;

import com.example.sergpetproject.integration.dto.*;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class JsonNodeToRandomApiResponse {
    public RandomApiResponse convert(JsonNode jsonNode) {
        JsonNode results = jsonNode.path("results");
        List<Person> personList = new ArrayList<>();
        for (JsonNode personNode : results) {
            personList.add(getPerson(personNode));
        }
        return new RandomApiResponse(personList);
    }

    private static Person getPerson(JsonNode personNode) {
        Person person = new Person();
        String gender = personNode.path("gender").textValue();
        String phoneNumber = personNode.path("phone").textValue();
        person.setGender(gender);
        person.setName(getName(personNode));
        person.setLocation(getLocation(personNode));
        person.setPhone(phoneNumber);
        return person;
    }

    private static Location getLocation(JsonNode personNode) {
        JsonNode locationNode = personNode.path("location");
        Street street = getStreet(locationNode);
        String city = locationNode.path("city").textValue();
        String country = locationNode.path("country").textValue();
        int postcode = locationNode.path("postcode").asInt();

        return new Location(street, city, country, postcode);
    }

    private static Street getStreet(JsonNode locationNode) {
        JsonNode streetNode = locationNode.path("street");
        int numberStreet = streetNode.path("number").asInt();
        String nameStreet = streetNode.path("name").textValue();
        return new Street(numberStreet, nameStreet);
    }

    private static Name getName(JsonNode personNode) {
        JsonNode nameNode = personNode.path("name");
        String title = nameNode.path("title").textValue();
        String first = nameNode.path("first").textValue();
        String last = nameNode.path("last").textValue();

        return new Name(title, first, last);
    }
}
