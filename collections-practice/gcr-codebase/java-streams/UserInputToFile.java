import java.io.*;
public class UserInputToFile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.print("Enter your age: ");
            String age = br.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();
            FileWriter fw = new FileWriter("user.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");
            fw.close();
            System.out.println("\nData saved successfully to file.");

        }
        catch (IOException e) {
            System.out.println("Error while reading input or writing to file.");
        }
    }
}
