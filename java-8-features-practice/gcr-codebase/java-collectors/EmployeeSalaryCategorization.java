import java.util.*;
import java.util.stream.*;

class Employee {
    private String department;
    private double salary;

    Employee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    String getDepartment() {
        return department;
        }

    double getSalary() {
        return salary;
        }
}

public class EmployeeSalaryCategorization {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("IT", 60000));
        employees.add(new Employee("IT", 70000));
        employees.add(new Employee("HR", 45000));
        employees.add(new Employee("Finance", 72000));

        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);
    }
}
