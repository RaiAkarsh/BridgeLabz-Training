package org.example;
import org.json.JSONObject;

public class CarToJson {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);

        JSONObject cj = new JSONObject();
        cj.put("brand", car.brand);
        cj.put("model", car.model);
        cj.put("year", car.year);
        System.out.println(cj.toString());
    }
}
