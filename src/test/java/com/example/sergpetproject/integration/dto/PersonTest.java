package com.example.sergpetproject.integration.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {
    @Test
   void testGender() {
        // создаем объект Person с полом "male"
        Person person1 = new Person("male", new Name(), new Location(), "123-456-7890");
        // проверяем, что пол равен "male"
        assertEquals("male", person1.getGender());
        // создаем объект Person с полом "female"
        Person person2 = new Person("female", new Name(), new Location(), "098-765-4321");
        // проверяем, что пол равен "female"
        assertEquals("female", person2.getGender());
        // проверяем, что пола не равны
        assertNotEquals(person1.getGender(), person2.getGender());
    }

}
