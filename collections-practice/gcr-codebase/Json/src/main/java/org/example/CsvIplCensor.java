package org.example;

import java.io.*;

public class CsvIplCensor {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src/main/java/org/example/ipl.csv")
        );

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/main/java/org/example/censored_ipl.csv")
        );

        bw.write(br.readLine()); // header
        bw.newLine();

        String line;
        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            data[1] = maskTeam(data[1]);
            data[2] = maskTeam(data[2]);
            data[5] = maskTeam(data[5]);
            data[6] = "REDACTED";

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Censored CSV generated");
    }

    private static String maskTeam(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }
}

