package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonIplCensor {

    public static void main(String[] args) throws Exception {

        String content = new String(
                Files.readAllBytes(Paths.get("src/main/java/org/example/ipl.json"))
        );

        JSONArray matches = new JSONArray(content);

        for (int i = 0; i < matches.length(); i++) {
            JSONObject match = matches.getJSONObject(i);

            match.put("team1", maskTeam(match.getString("team1")));
            match.put("team2", maskTeam(match.getString("team2")));
            match.put("winner", maskTeam(match.getString("winner")));
            match.put("player_of_match", "REDACTED");

            JSONObject score = match.getJSONObject("score");
            JSONObject newScore = new JSONObject();

            for (String key : score.keySet()) {
                newScore.put(maskTeam(key), score.getInt(key));
            }

            match.put("score", newScore);
        }

        Files.write(
                Paths.get("src/main/java/org/example/censored_ipl.json"),
                matches.toString(2).getBytes()
        );

        System.out.println("Censored JSON generated");
    }

    private static String maskTeam(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }
}
