package org.example;

import org.json.JSONObject;

public class MergeJson {
    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        json1.put("name", "Akarsh");

        JSONObject json2 = new JSONObject();
        json2.put("age", 21);
        json2.put("city", "Delhi");

        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key));
        }

        System.out.println(json1.toString(2));
    }
}

