interface Worker {
    void performDuties();
}
class Person {
    String name;
    int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker c = new Chef("Rahul", 101);
        Worker w = new Waiter("Amit", 102);
        ((Person) c).displayInfo();
        c.performDuties();
        ((Person) w).displayInfo();
        w.performDuties();
    }
}
