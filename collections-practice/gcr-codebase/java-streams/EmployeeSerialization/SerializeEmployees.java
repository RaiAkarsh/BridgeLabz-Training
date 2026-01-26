import java.io.*;
import java.util.ArrayList;

public class SerializeEmployees {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Akarsh", "IT", 50000));
        employees.add(new Employee(102, "Kanhiya", "HR", 45000));
        employees.add(new Employee(103, "Arsh", "Finance", 60000));

        try (
            FileOutputStream fos = new FileOutputStream("employees.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully into employees.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
