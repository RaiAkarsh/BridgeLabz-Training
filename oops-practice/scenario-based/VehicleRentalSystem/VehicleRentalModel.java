// Abstraction
interface IRentable {
    double calculateRent(int days);
}

// Encapsulation
class Vehicle implements IRentable {
    protected String vehicleId;
    protected String brand;
    protected int modelYear;
    protected double baseRate;

    Vehicle(String vehicleId, String brand, int modelYear, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.modelYear = modelYear;
        this.baseRate = baseRate;
    }

    // Polymorphism
    public double calculateRent(int days) {
        return baseRate * days;
    }
}

// Inheritance
class Bike extends Vehicle {
    Bike(String id, String brand, int year, double rate) {
        super(id, brand, year, rate);
    }
}

// Inheritance
class Car extends Vehicle {
    Car(String id, String brand, int year, double rate) {
        super(id, brand, year, rate);
    }
}

// Inheritance
class Truck extends Vehicle {
    Truck(String id, String brand, int year, double rate) {
        super(id, brand, year, rate);
    }
}

// Encapsulation
class Customer {
    private int customerId;
    private String name;
    private String contact;

    Customer(int customerId, String name, String contact) {
        this.customerId = customerId;
        this.name = name;
        this.contact = contact;
    }
}
