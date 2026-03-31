package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJson {
    public static void main(String[] args) {

        String json =
                "["
                        + " {\"name\":\"A\", \"age\":20},"
                        + " {\"name\":\"B\", \"age\":30},"
                        + " {\"name\":\"C\", \"age\":27}"
                        + "]";

        JSONArray array = new JSONArray(json);

        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                System.out.println(obj.toString());
            }
        }
    }
}
