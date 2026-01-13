import java.util.*;

public class TrafficManagerMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        TrafficManagerFunc tm = new TrafficManagerFunc();

        int choice = -1;

        while (choice != 0) {
            System.out.println("-------------------");
            System.out.println("1 Add Vehicle");
            System.out.println("2 Remove Vehicle");
            System.out.println("3 Update Vehicle");
            System.out.println("4 View Roundabout");
            System.out.println("0 Exit");
            System.out.println("Enter choice: ");
            System.out.println("-------------------");

            choice = x.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Vehicle ID to add: ");
                    tm.add(x.next());
                    break;
                case 2:
                    System.out.println("Removing last vehicle added.");
                    tm.remove();
                    break;
                case 3:
                    System.out.println("Enter old Vehicle ID and new Vehicle ID to update: ");
                    tm.update(x.next(), x.next());
                    break;
                case 4:
                    System.out.println("Vehicles in Roundabout:");
                    tm.print();
                    break;
            }
        }
    }
}
