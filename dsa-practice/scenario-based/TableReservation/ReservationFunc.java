import java.util.*;
class Table {
    int tableNumber;

    Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }
}
class Reservation {
    int tableNumber;
    String timeSlot;

    Reservation(int tableNumber, String timeSlot) {
        this.tableNumber = tableNumber;
        this.timeSlot = timeSlot;
    }
}

class TableAlreadyReservedException extends Exception {
    TableAlreadyReservedException(String message) {
        super(message);
    }
}

class Restaurant {
    Map<Integer, Table> tableMap = new HashMap<>();
    List<Reservation> reservationsList = new ArrayList<>();

    Restaurant() {
        tableMap.put(1, new Table(1));
        tableMap.put(2, new Table(2));
        tableMap.put(3, new Table(3));
    }
    public void reserveTable(int tableNumber, String timeSlot) throws TableAlreadyReservedException {
        for (Reservation r : reservationsList) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " already reserved at " + timeSlot);
            }
        }
        reservationsList.add(new Reservation(tableNumber, timeSlot));
        System.out.println("Table " + tableNumber + " reserved at " + timeSlot);
    }

    public void cancelReservation(int tableNumber, String timeSlot) {

        reservationsList.removeIf(r -> r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot));
        System.out.println("Reservation cancelled for Table " + tableNumber + " at " + timeSlot);
    }

    
    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables at " + timeSlot + ":");
        for (int tableNo : tableMap.keySet()) {
            boolean isReserved = false;
            for (Reservation res : reservationsList) {
                if (res.tableNumber == tableNo && res.timeSlot.equals(timeSlot)) {
                    isReserved = true;
                    break;
                }
            }
            if (!isReserved) {
                System.out.println("Table " + tableNo);
            }
        }
        System.out.println("-----");
    }
}
