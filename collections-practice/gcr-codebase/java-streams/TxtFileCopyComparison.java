import java.io.*;

public class TxtFileCopyComparison {

    public static void main(String[] args) {

        String sourceFile = "source.txt";
        long unbufferedStart = System.nanoTime();
        Unbuffered(sourceFile, "unbufferedCopy.txt");
        long unbufferedEnd = System.nanoTime();

        // -------- Buffered Copy --------
        long bufferedStart = System.nanoTime();
        Buffered(sourceFile, "bufferedCopy.txt");
        long bufferedEnd = System.nanoTime();

        System.out.println("\nExecution Time Comparison:");
        System.out.println("Unbuffered Time (ns): " + (unbufferedEnd - unbufferedStart));
        System.out.println("Buffered Time   (ns): " + (bufferedEnd - bufferedStart));
    }

    private static void Unbuffered(String source, String destination) {
        byte[] buffer = new byte[4096];
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)
        ) {
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error during unbuffered copy");
            e.printStackTrace();
        }
    }
    private static void Buffered(String source, String destination) {
        byte[] buffer = new byte[4096];
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error during buffered copy");
        }
    }
}
