import java.io.*;

public class CompareReaders {
    public static void main(String[] args) {
        int wordsFR = 0;
        long startFR = System.nanoTime();
        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordsFR += arr.length;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        long timeFR = System.nanoTime() - startFR;

        int wordsISR = 0;
        long startISR = System.nanoTime();
        try {
            FileInputStream fis = new FileInputStream("sample.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordsISR += arr.length;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        long timeISR = System.nanoTime() - startISR;

        System.out.println("FileReader Words: " + wordsFR + " Time: " + timeFR + " ns");
        System.out.println("InputStreamReader Words: " + wordsISR + " Time: " + timeISR + " ns");
    }
}
