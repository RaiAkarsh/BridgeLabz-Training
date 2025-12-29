import java.util.*;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int totalDistance = 0;
        while (true) {
            System.out.println("Enter distance");
            int distance = x.nextInt();
            totalDistance += distance;
            System.out.println("Do you want to get off at this stop? (yes/no)");
            String response = x.next().toLowerCase(); 
            if (response.equals("yes")) {
                System.out.println("Total distance traveled: " + totalDistance);
                break;            
            }
        }
    }
}

