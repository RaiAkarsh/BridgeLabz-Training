import java.io.*;
public class ImageToByteArray {

    public static void main(String[] args) {

        String sourceImage = "original.png";
        String destinationImage = "copy.png";

        try {
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            // Convert to byte array
            byte[] imageBytes = baos.toByteArray();

            //Write byte array back to image file 
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destinationImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fos.close();

            System.out.println("Image successfully converted to byte array and restored.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
