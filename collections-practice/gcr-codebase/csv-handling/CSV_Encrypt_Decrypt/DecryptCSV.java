import java.io.*;
import java.util.Base64;

public class DecryptCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("secure.csv"));
        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            String email = new String(Base64.getDecoder().decode(d[1]));
            String salary = new String(Base64.getDecoder().decode(d[2]));

            System.out.println("Email: " + email + ", Salary: " + salary);
        }
        br.close();
    }
}
