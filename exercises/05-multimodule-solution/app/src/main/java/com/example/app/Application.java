package com.example.app;

import com.example.core.Utility;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        System.out.println("JSON:\n" + Utility.convertToJson(Map.of("testKey", "testValue")));
    }
}
