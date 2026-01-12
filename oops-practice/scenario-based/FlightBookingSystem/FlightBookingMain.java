import java.util.*;

public class FlightBookingMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        FlightBookingModel[] flights = {
                new FlightBookingModel(1, "Delhi", "Mumbai", 5000),
                new FlightBookingModel(2, "Delhi", "Chennai", 6000)
        };

        ArrayList<Booking> bookings = new ArrayList<>();

        int choice = -1;

        while (choice != 0) {

            System.out.println("1 Search Flight");
            System.out.println("2 Book Flight");
            System.out.println("3 View Bookings");
            System.out.println("4 Cancel Booking");
            System.out.println("0 Exit");

            choice = x.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter source");
                    String src = x.next();

                    for (FlightBookingModel f : flights) {
                        if (f.getSource().equalsIgnoreCase(src))
                            f.displayFlight();
                    }
                    break;

                case 2:
                    System.out.println("Enter BookingId Name FlightId");
                    bookings.add(
                            new Booking(x.nextInt(), x.next(), x.nextInt())
                    );
                    break;

                case 3:
                    for (Booking b : bookings)
                        b.displayBooking();
                    break;

                case 4:
                    System.out.println("Enter index");
                    bookings.remove(x.nextInt()-1);
                    break;

                case 0:
                    System.out.println("Exit");
            }
        }
    }
}
