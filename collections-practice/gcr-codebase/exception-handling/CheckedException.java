import java.io.*;
public class CheckedException {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
