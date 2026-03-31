interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String department;
    Employee(String employeeId , String name , double baseSalary ) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    public String getDepartmentDetails() {
        return department;
    }
    abstract double calculateSalary() ; 

    void displayDetails() {
        System.out.println("Employee ID is : " + employeeId);
        System.out.println("Name of the employee : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String id, String name, double salary) {
        super(id, name, salary);
    }
    double calculateSalary() {
        return getBaseSalary();
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    PartTimeEmployee(String id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("121", "Akarsh", 50000);
        Employee e2 = new PartTimeEmployee("112", "harsh", 40, 500);
        e1.assignDepartment("Tech");
        e2.assignDepartment("Sales");
        Employee[] employees = { e1, e2 };
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
