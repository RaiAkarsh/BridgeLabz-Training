abstract class Employee {

    private final String name;
    private final double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected double getSalary() {
        return salary;
    }

    // Polymorphic method
    public abstract double getBonus();
}

class Manager extends Employee {

    private final double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        this.bonus = salary * 0.10; // 10%
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}

class Developer extends Employee {

    private final double bonus;

    public Developer(String name, double salary) {
        super(name, salary);
        this.bonus = salary > 50000 ? salary * 0.05 : 0.0;
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}
