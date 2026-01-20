public class EmployeeMain {
    public static void main(String[] args) {

        Employee e1 = new Manager("Alice", 80000);
        Employee e2 = new Developer("Bob", 60000);
        Employee e3 = new Developer("Tom", 40000);

        System.out.println(e1.getBonus()); // 8000
        System.out.println(e2.getBonus()); // 3000
        System.out.println(e3.getBonus()); // 0
    }
}
