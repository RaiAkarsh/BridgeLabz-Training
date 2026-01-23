import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    Map<Integer, PolicyClass> hashMap = new HashMap<>();
    Map<Integer, PolicyClass> linkedHashMap = new LinkedHashMap<>();
    Map<LocalDate, PolicyClass> treeMap = new TreeMap<>();

    public static void main(String[] args) {
        PolicyManager is = new PolicyManager();
        is.addPolicy(new PolicyClass(101,"Akarsh",LocalDate.now().plusDays(10)));
        is.addPolicy(new PolicyClass(102,"Arsh",LocalDate.now().plusDays(40)));
        is.addPolicy(new PolicyClass(103,"Akarsh",LocalDate.now().minusDays(1)));
        is.getPolicyByNumber(101);
        is.expiringIn30Days();
        is.policiesByHolder("Akarsh");
        is.removeExpired();
    }

    public void addPolicy(PolicyClass p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);
        treeMap.put(p.expiryDate, p);
    }

    public void getPolicyByNumber(int num) {
        System.out.println(hashMap.get(num));
    }

    public void expiringIn30Days() {
        LocalDate limit = LocalDate.now().plusDays(30);
        for (LocalDate d : treeMap.keySet()) {
            if (!d.isAfter(limit)) {
                System.out.println(treeMap.get(d));
            }
        }
    }

    public void policiesByHolder(String name) {
        for (PolicyClass p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    public void removeExpired() {
        LocalDate today = LocalDate.now();
        hashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
    }
}
