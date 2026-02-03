package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;

public class ListToJsonArray {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Model 3", 2024));
        cars.add(new Car("BMW", "X5", 2023));


        JSONArray array = new JSONArray();

        for (Car car : cars) {
            JSONObject obj = new JSONObject();
            obj.put("brand", car.brand);
            obj.put("model", car.model);
            obj.put("year", car.year);
            array.put(obj);
        }

        System.out.println(array.toString());
    }
}

