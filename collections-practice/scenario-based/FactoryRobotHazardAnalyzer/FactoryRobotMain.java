import java.util.*;

public class FactoryRobotMain {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();
        try {
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = x.nextDouble();

            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = x.nextInt();
            x.nextLine();

            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState = x.nextLine();

            double risk = auditor.CalculateHazardRisk(
                    armPrecision, workerDensity, machineryState);

            System.out.println("Robot Hazard Risk Score: " + risk);

        }
        catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}
