class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean booked = false;
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.display();
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.bookTicket("Dragon", "A10", 120);
        ticket.display();
    }
    void bookTicket(String movie, String seat, double amount) {
        if (!booked) {
            movieName = movie;
            seatNumber = seat;
            price = amount;
            booked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    void display() {
        if (!booked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }
}
