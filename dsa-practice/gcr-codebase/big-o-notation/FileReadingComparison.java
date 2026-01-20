import java.io.*;

public class FileReadingComparison {
    public static void main(String[] args) throws Exception {
        File file = new File("large.txt");

        long start = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1);
        fr.close();
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start)/1e6 + " ms");

        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1);
        isr.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start)/1e6 + " ms");
    }
}
