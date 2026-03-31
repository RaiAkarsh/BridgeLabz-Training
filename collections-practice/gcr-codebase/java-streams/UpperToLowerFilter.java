import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class UpperToLowerFilter {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))) {
            int ch;

            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted from uppercase to lowercase successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
