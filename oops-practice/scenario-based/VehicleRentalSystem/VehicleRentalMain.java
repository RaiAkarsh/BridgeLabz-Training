import java.util.*;

public class VehicleRentalMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        int choice = -1;

        while (choice != 0) {
            System.out.println("---------------------");
            System.out.println("1 Add Vehicle");
            System.out.println("2 View Vehicles");
            System.out.println("3 Update Vehicle");
            System.out.println("4 Delete Vehicle");
            System.out.println("5 Calculate Rent");
            System.out.println("0 Exit");
            System.out.println("Enter choice");
            System.out.println("----------------------");

            choice = x.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter type 1 Bike 2 Car 3 Truck");
                    int type = x.nextInt();

                    System.out.println("Enter Id Brand ModelYear BaseRate");
                    String id = x.next();
                    String brand = x.next();
                    int year = x.nextInt();
                    double rate = x.nextDouble();

                    if (type == 1)
                        vehicles.add(new Bike(id, brand, year, rate));
                    else if (type == 2)
                        vehicles.add(new Car(id, brand, year, rate));
                    else
                        vehicles.add(new Truck(id, brand, year, rate));
                    break;

                case 2:
                    for (int i = 0; i < vehicles.size(); i++) {
                        Vehicle v = vehicles.get(i);
                        System.out.println(i + " " + v.vehicleId + " " +v.brand + " " + v.modelYear + " " + v.baseRate);
                    }
                    break;

                case 3:
                    System.out.println("Enter index");
                    int index = x.nextInt();

                    System.out.println("Enter Id Brand ModelYear BaseRate");
                    vehicles.set(
                            index,
                            new Car(x.next(), x.next(), x.nextInt(), x.nextDouble())
                    );
                    break;

                case 4:
                    System.out.println("Enter index");
                    vehicles.remove(x.nextInt());
                    break;

                case 5:
                    System.out.println("Enter vehicle index");
                    int i = x.nextInt();

                    System.out.println("Enter number of days");
                    int days = x.nextInt();

                    System.out.println("Total Rent = " + vehicles.get(i).calculateRent(days));
                    break;

                case 0:
                    System.out.println("Exit");
            }
        }
    }
}
