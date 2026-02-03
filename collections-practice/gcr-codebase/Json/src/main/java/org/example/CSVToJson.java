package org.example;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.BufferedReader;
import java.io.FileReader;
public class CSVToJson {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/example/data.csv"));
        String headerLine = br.readLine();
        String[] headers = headerLine.split(",");
        JSONArray jsonArray = new JSONArray();
        String line;
        while ((line = br.readLine()) != null) {
            String values[] = line.split(",");
            JSONObject jsonObject = new JSONObject();
            for (int i = 0; i < headers.length; i++) {
                jsonObject.put(headers[i], values[i]);
            }
            jsonArray.put(jsonObject);
        }
        System.out.println(jsonArray.toString());
        br.close();
    }

}

