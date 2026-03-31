class TicketNode {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    public TicketNode(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
public class OnlineTicketReservation {
    private TicketNode head;

    public OnlineTicketReservation() {
        this.head = null;
    }

    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TicketNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode current = head;
        TicketNode prev = null;
        do {
            if (current.ticketID == ticketID) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    TicketNode tail = head;
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    head = head.next;
                    tail.next = head;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Ticket ID not found");
    }
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode current = head;
        do {
            System.out.println("----------------------------");
            System.out.println("Ticket ID: " + current.ticketID + ", Customer Name: " + current.customerName +", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +", Booking Time: " + current.bookingTime);
            System.out.println("----------------------------");
            current = current.next;
        } while (current != head);
    }
    public void searchTicketByCustomerName(String customerName) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer Name: " + current.customerName +", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tickets found for customer: " + customerName);
        }
    }
    public int countTickets() {
        if (head == null) {
            return 0;
        }
        TicketNode current = head;
        int count = 0;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
    public static void main(String[] args) {
        OnlineTicketReservation rs = new OnlineTicketReservation();
        rs.addTicket(1, "Alice", "Inception", "A1", "2024-06-01 10:00");
        rs.addTicket(2, "Bob", "Interstellar", "B2", "2024-06-01 11:00");
        rs.displayTickets();
        System.out.println("Total Tickets Booked: " + rs.countTickets());
        rs.searchTicketByCustomerName("Alice");
        rs.removeTicket(1);
        rs.displayTickets();
        System.out.println("Total Tickets Booked: " + rs.countTickets());
    }
    
}
