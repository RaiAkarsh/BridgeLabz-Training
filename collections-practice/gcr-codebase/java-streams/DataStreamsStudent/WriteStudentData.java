import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStudentData {

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.txt"))) {
            dos.writeInt(101);
            dos.writeUTF("Akarsh");
            dos.writeDouble(8.75);
            System.out.println("Student data written successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
