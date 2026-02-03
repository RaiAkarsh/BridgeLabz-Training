package org.example;

import org.json.JSONObject;
import org.json.XML;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXMLFromFile {
    public static  void main(String[] args) throws Exception {
        String jstring = new String(Files.readAllBytes(Paths.get("src/main/java/org/example/sample.json")));
        // Convert JSON string to JSONObject
        JSONObject json = new JSONObject(jstring);
        // Convert JSONObject to XML string
        String xml = XML.toString(json);
        System.out.println(xml);
    }
}
