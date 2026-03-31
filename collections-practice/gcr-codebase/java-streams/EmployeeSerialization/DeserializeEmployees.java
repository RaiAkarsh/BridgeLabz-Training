import java.io.*;
import java.util.ArrayList;

public class DeserializeEmployees {

    public static void main(String[] args) {

        try (
            FileInputStream fis = new FileInputStream("employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            ArrayList<Employee> employees = (ArrayList<Employee>) ois.readObject();

            System.out.println("Employee Details:");
            for (Employee emp : employees) {
                emp.display();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
