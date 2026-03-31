interface Refuelable {
    void refuel();
}
class Vehicle {
    int maxSpeed;
    String model;
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void displayVehicle() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed);
    }
}
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    public void charge() {
        System.out.println("Electric vehicle is charging");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is refueling");
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 180);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 200);
        ev.displayVehicle();
        ev.charge();
        pv.displayVehicle();
        pv.refuel();
    }
}
