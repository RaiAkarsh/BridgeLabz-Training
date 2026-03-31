import java.util.*;

public class CabBooking {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Random rand = new Random();

        // CREATE 10 DRIVERS (AUTO NAMES + RANDOM AVAILABILITY)
        Driver[] drivers = new Driver[10];

        for (int i = 0; i < 10; i++) {
            drivers[i] = new Driver("Driver" + (i + 1));
            drivers[i].available = rand.nextInt(2) == 1;
        }

        while (true) {

            try {
                // CHECK AVAILABLE DRIVER
                Driver assignedDriver = null;
                for (Driver d : drivers) {
                    if (d.available) {
                        assignedDriver = d;
                        break;
                    }
                }

                if (assignedDriver == null) {
                    throw new NoDriverAvailableException(
                            "No drivers available. Booking closed.");
                }

                // USER INPUT
                System.out.println("\nEnter user name  or exit to quit: ");
                String userName = x.nextLine();

                if (userName.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting Cab Booking System.");
                    break;
                }

                System.out.print("Enter destination: ");
                String destination = x.nextLine();

                System.out.print("Enter distance (km): ");
                double distance = x.nextDouble();
                x.nextLine(); 

                User user = new User(userName);

                // RANDOM PEAK HOUR
                boolean isPeakHour = rand.nextInt(2) == 1;
                FareCalculator calculator;

                if (isPeakHour) {
                    System.out.println("Peak Hour Pricing Applied");
                    calculator = new PeakFareCalculator();
                } else {
                    System.out.println("Normal Pricing Applied");
                    calculator = new NormalFareCalculator();
                }

                // BOOK RIDE
                assignedDriver.available = false;
                double fare = calculator.calculateFare(distance);

                Ride ride = new Ride(user, assignedDriver, distance, fare);

                System.out.println("\nRide Booked Successfully!");
                ride.showRide();
                System.out.println("Destination: " + destination);

            } catch (NoDriverAvailableException e) {
                System.out.println("\n" + e.getMessage());
                break; // EXIT when no drivers
            }
        }

        x.close();
    }
}
