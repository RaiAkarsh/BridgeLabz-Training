public class ReservationMain {
    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        try {
            res.reserveTable(1, "6PM");
            res.reserveTable(2, "10PM");
            res.reserveTable(1, "6PM"); 
        }
        catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }
        res.showAvailableTables("6PM");
        res.cancelReservation(1, "6PM");
        res.showAvailableTables("10PM");
    }
}
