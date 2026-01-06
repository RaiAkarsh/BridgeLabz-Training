 interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insuranceNumber;
    Vehicle(String vehicleNumber, String type, double rentalRate, String insuranceNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insuranceNumber = insuranceNumber;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    abstract double calculateRentalCost(int days);
    public double calculateInsurance() {
        return 0;
    }
    public String getInsuranceDetails() {
        return "No Insurance Details";
    }
    void displayRentalDetails(int days) {
        double totalCost = calculateRentalCost(days) + calculateInsurance();
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Type : " + type);
        System.out.println("Rental Rate per day : " + rentalRate);
        System.out.println("Days Rented : " + days);
        System.out.println("Rental Cost : " + calculateRentalCost(days));
        System.out.println("Insurance Cost : " + calculateInsurance());
        System.out.println("Total Cost : " + totalCost);
        System.out.println("---------------------------");
    }
}
class Car extends Vehicle  {
    Car(String vehicleNumber, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, "Car", rentalRate, insuranceNumber);
    }
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 50.0; 
    }
    public String getInsuranceDetails() {
        return "Comprehensive Car Insurance";
    }
}
class Bike extends Vehicle  {
    Bike(String vehicleNumber, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, "Bike", rentalRate, insuranceNumber);
    }
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 20.0; 
    }
    public String getInsuranceDetails() {
        return "Standard Bike Insurance";
    }
}
class Truck extends Vehicle {
    Truck(String vehicleNumber, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, "Truck", rentalRate, insuranceNumber);
    }
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 100.0; 
    }
    public String getInsuranceDetails() {
        return "Heavy Vehicle Truck Insurance";
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", 70.0, "INS-CAR-001");
        Vehicle bike = new Bike("BIKE456", 30.0, "INS-BIKE-002");
        Vehicle truck = new Truck("TRUCK789", 150.0, "INS-TRUCK-003");

        car.displayRentalDetails(5);
        bike.displayRentalDetails(3);
        truck.displayRentalDetails(7);
    }    
}
