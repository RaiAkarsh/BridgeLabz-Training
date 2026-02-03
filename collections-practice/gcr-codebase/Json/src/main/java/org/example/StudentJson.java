package org.example;
import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();

        student.put("name", "Akarsh");
        student.put("age", 21);

        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("DSA");
        subjects.put("ML");

        student.put("subjects", subjects);

        System.out.println(student.toString());
    }
}

