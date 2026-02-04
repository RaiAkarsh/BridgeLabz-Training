import java.util.*;

public class IoTSensorsReadings {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(45);
        ll.add(67);
        ll.add(89);
        ll.add(23);
        ll.add(12);
        ll.stream().filter(x -> x > 50).forEach(System.out::println);
    }
}