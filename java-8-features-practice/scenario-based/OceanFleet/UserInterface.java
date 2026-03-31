import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        VesselUtil util = new VesselUtil();
        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(x.nextLine());
        System.out.println("Enter vessel details");
        for (int i = 0; i < n; i++) {

            String input = x.nextLine();
            String[] arr = input.split(":");
            Vessel vessel = new Vessel(
                    arr[0],
                    arr[1],
                    Double.parseDouble(arr[2]),
                    arr[3]
            );
            util.addVesselPerformance(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String searchId = x.nextLine();
        Vessel v = util.getVesselById(searchId);
        if (v != null) {
            System.out.println(v.getVesselId() + " | " + v.getVesselName() + " | " + v.getVesselType() + " | " + v.getAverageSpeed() + " knots");
        } 
        else {
            System.out.println("Vessel Id " + searchId + " not found");
        }
        System.out.println("High performance vessels are");
        List<Vessel> highList = util.getHighPerformanceVessels();
        for (Vessel hv : highList) {
            System.out.println(hv.getVesselId() + " | " + hv.getVesselName() + " | " + hv.getVesselType() + " | " + hv.getAverageSpeed() + " knots");
        }
    }
}