public class Employee {
     static String companyName = "Tech Solutions Inc";
     static int totalEmployees = 0;
     String name;
     final int id;
     String designation;
        Employee(String name, int id, String designation) {
            this.name = name;
            this.id = id;
            this.designation = designation;
            totalEmployees++;
        }

        static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }
        void displayDetails() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
        
    public static void main(String[] args) {

        Employee e1 = new Employee("Thamarai",101, "Software Engineer");
        Employee e2 = new Employee("Rohan", 102, "Project Manager");
        Employee.displayTotalEmployees();
        if (e1 instanceof Employee) {
            e1.displayDetails();
        }
        if (e2 instanceof Employee) {
            e2.displayDetails();
        }
    }
    
}
