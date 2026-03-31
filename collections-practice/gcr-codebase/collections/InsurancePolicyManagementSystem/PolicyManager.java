import java.time.LocalDate;
import java.util.*;
public class PolicyManager {
    Set<PolicyClass> hashSet = new HashSet<>();
    Set<PolicyClass> linkedHashSet = new LinkedHashSet<>();
    Set<PolicyClass> treeSet = new TreeSet<>();
    public void addPolicy(PolicyClass p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }
    public void policiesExpiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);
        for (PolicyClass p : treeSet) {
            if (!p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }
    public void policiesByCoverage(String type) {
        for (PolicyClass p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }
    public void findDuplicatePolicies(List<PolicyClass> list) {
        Set<Integer> seen = new HashSet<>();
        for (PolicyClass p : list) {
            if (!seen.add(p.policyNumber)) {
                System.out.println("Duplicate: " + p);
            }
        }
    }
    public void performanceTest() {
        PolicyClass temp = new PolicyClass(999, "Test", LocalDate.now(), "Health", 1000);
        long start = System.nanoTime();
        hashSet.add(temp);
        hashSet.contains(temp);
        hashSet.remove(temp);
        System.out.println("HashSet Time is : " + (System.nanoTime() - start));
        start = System.nanoTime();
        linkedHashSet.add(temp);
        linkedHashSet.contains(temp);
        linkedHashSet.remove(temp);
        System.out.println("LinkedHashSet Time is : " + (System.nanoTime() - start));
        start = System.nanoTime();
        treeSet.add(temp);
        treeSet.contains(temp);
        treeSet.remove(temp);
        System.out.println("TreeSet Time is : " + (System.nanoTime() - start));
    }
}
