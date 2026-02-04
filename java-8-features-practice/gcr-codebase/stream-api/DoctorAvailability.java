import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekend;

    Doctor(String name, String specialty, boolean weekend) {
        this.name = name;
        this.specialty = specialty;
        this.weekend = weekend;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> docs = List.of(
                new Doctor("Rohit", "Cardio", true),
                new Doctor("Shikhar", "Ortho", true),
                new Doctor("Arsh", "Neuro", false)
        );
        docs.stream().filter(d -> d.weekend)
                .sorted(Comparator.comparing(d -> d.specialty))
                .forEach(d -> System.out.println(d.name));
    }
}