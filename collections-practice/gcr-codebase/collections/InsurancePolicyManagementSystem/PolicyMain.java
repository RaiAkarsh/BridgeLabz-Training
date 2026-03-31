import java.time.LocalDate;
import java.util.*;

public class PolicyMain {
    public static void main(String[] args) {
        PolicyManager pm = new PolicyManager();
        PolicyClass p1 = new PolicyClass(101,"Shiven", LocalDate.now().plusDays(10),"Health",5000);
        PolicyClass p2 = new PolicyClass(102,"Shikhar", LocalDate.now().plusDays(40),"Auto",3000);
        PolicyClass p3 = new PolicyClass(103,"Akarsh", LocalDate.now().plusDays(20),"Home",7000);
        PolicyClass p4 = new PolicyClass(101,"Arsh", LocalDate.now().plusDays(10),"Health",5000);
        pm.addPolicy(p1);
        pm.addPolicy(p2);
        pm.addPolicy(p3);
        pm.addPolicy(p4);
        System.out.println("All Policies:");
        pm.displayAllPolicies();

        System.out.println("\nExpiring in 30 Days:");
        pm.policiesExpiringSoon();

        System.out.println("\nHealth Policies:");
        pm.policiesByCoverage("Health");

        System.out.println("\nDuplicate Policies:");
        pm.findDuplicatePolicies(Arrays.asList(p1,p2,p3,p4));

        System.out.println("\nPerformance Comparison:");
        pm.performanceTest();
    }
}
