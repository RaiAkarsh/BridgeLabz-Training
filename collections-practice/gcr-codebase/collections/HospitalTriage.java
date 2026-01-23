import java.util.*;
class Patient {
    String name;
    int severity;
    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}
public class HospitalTriage {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
        System.out.println("Enter number of patients:");
        int n = x.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and severity:");
            pq.add(new Patient(x.next(), x.nextInt()));
        }
        System.out.println("Treatment Order:");
        while (!pq.isEmpty())
            System.out.println(pq.remove().name);
    }
}
