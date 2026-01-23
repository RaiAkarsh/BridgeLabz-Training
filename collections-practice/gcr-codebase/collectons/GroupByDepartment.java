import java.util.*;
class Employee {
    String employeeName;
    String department;
    Employee(String employeeName, String department) {
        this.employeeName = employeeName;
        this.department = department;
    }
}
public class GroupByDepartment {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int employeeCount = x.nextInt();
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (int i = 0; i < employeeCount; i++) {
            String employeeName = x.next();
            String department = x.next();
            departmentMap.putIfAbsent(department, new ArrayList<>());
            departmentMap.get(department).add(new Employee(employeeName, department));
        }
        for (String department : departmentMap.keySet()) {
            System.out.print(department + ": ");
            for (Employee emp : departmentMap.get(department))
                System.out.print(emp.employeeName + " ");
            System.out.println();
        }
    }
}