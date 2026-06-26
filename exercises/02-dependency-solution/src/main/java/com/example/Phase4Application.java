package com.example;

import com.google.gson.Gson;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Phase4Application {

    public static void main(String[] args) {
        SpringApplication.run(Phase4Application.class, args);

        String json = convertToJson(Map.of("testKey", "testValue"));
        System.out.println(json);
    }

    static @NonNull String convertToJson(Map<String, String> map) {
        return new Gson().toJson(map);
    }

}
