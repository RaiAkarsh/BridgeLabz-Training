// Encapsulation
class FlightBookingModel {
    private int flightId;
    private String source;
    private String destination;
    private double price;

    FlightBookingModel(int flightId, String source, String destination, double price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    String getSource() {
        return source;
    }

    void displayFlight() {
        System.out.println(flightId + " " + source + " " + destination + " " + price);
    }
}

// Encapsulation
class Booking {
    private int bookingId;
    private String passengerName;
    private int flightId;

    Booking(int bookingId, String passengerName, int flightId) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.flightId = flightId;
    }

    void displayBooking() {
        System.out.println(bookingId + " " + passengerName + " " + flightId);
    }
}

