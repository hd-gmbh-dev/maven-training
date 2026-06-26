package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class Phase4ApplicationTests {

    @Test
    void convertToJson() {
        Assertions.assertEquals("{\"testKey\":\"testValue\"}", Phase4Application.convertToJson(Map.of("testKey", "testValue")));
    }

}
