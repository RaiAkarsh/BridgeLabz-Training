class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    void display() {
        System.out.println(guestName + " | " + roomType + " | Nights: " + nights);
    }
}
public class HotelBookingTest {
    public static void main(String[] args) {
        // Creating hotel booking objects using different constructors
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Akarsh", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        booking1.display();
        booking2.display();
        booking3.display();
    }
}