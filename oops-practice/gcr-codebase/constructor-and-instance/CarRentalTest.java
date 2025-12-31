class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Default constructor
    CarRental() {
        customerName = "Customer";
        carModel = "Basic";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println(customerName + " | " + carModel +
                " | Total Cost: ₹" + calculateTotalCost());
    }
}
public class CarRentalTest {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Ravi", "SUV", 5);
        rental1.display();
        rental2.display();
    }
}