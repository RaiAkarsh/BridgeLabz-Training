class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee{
    String internshipduration;
    public Intern(String name, int id, double salary, String internshipduration){
        super(name, id, salary);
        this.internshipduration = internshipduration;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipduration);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 101, 90000, 10),
            new Developer("Bob", 102, 80000, "Java"),
            new Intern("Charlie", 103, 30000, "6 months")
        };

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }
    }
    
}
