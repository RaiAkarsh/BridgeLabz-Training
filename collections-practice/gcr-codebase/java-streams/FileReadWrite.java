import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {

        File sourceFile = new File("source.txt");
        File destinationFile = new File("destination.txt");
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }
        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
        }
    }
}
