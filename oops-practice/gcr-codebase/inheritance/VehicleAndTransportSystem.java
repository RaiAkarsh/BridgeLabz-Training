class Vehicle{
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayinfo(){
        System.out.println("Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle{
    int seatingCapacity;
    public Car(int maxSpeed, String fuelType, int seatingCapacity){
        super(maxSpeed, fuelType);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void displayinfo(){
        System.out.println("Car Details:");
        super.displayinfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}
class Truck extends Vehicle{
    int weightCapacity;
    public Truck(int maxSpeed, String fuelType, int weightCapacity){
        super(maxSpeed, fuelType);
        this.weightCapacity = weightCapacity;
    }
    @Override
    public void displayinfo(){
        System.out.println("Truck Details:");
        super.displayinfo();
        System.out.println("Weight Capacity: " + weightCapacity);
    }
}
class Motorcycle extends Vehicle{
    String type;;
    public Motorcycle(int maxSpeed, String fuelType, String type){
        super(maxSpeed, fuelType);
        this.type = type;
    }
    @Override
    public void displayinfo(){
        System.out.println("Motorcycle Details:");
        super.displayinfo();
        System.out.println("Type: " + type);
    }
}
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10000),
            new Motorcycle(160, "Petrol", "Sport")
        };

        for (Vehicle v : vehicles) {
            v.displayinfo();
            System.out.println();
        }
    }
    
}
