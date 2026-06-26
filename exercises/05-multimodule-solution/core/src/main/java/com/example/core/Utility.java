package com.example.core;

import com.google.gson.Gson;

import java.util.Map;

public class Utility {

    public static String convertToJson(Map<String,String> map){
        return new Gson().toJson(map);
    }

}
