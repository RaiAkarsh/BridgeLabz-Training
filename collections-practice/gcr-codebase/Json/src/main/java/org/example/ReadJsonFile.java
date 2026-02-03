package org.example;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJsonFile {
    public static void main(String[] args) throws Exception {
        String json = new String(Files.readAllBytes(Paths.get("src/main/java/org/example/sample.json")));
        JSONObject obj = new JSONObject(json);
        System.out.println("Name: " + obj.getString("name"));
        System.out.println("Age: " + obj.getInt("age"));
    }
}


