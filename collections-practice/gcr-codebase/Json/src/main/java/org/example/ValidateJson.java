package org.example;

import org.json.JSONObject;

public class ValidateJson {
    public static void main(String[] args) {
        String json = "{ \"name\": \"Akarsh\", \"age\": 21 }";

        try {
            new JSONObject(json);
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}

