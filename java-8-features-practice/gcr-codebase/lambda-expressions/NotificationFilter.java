import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String type) {
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("EMERGENCY"));
        alerts.add(new Alert("INFO"));
        alerts.add(new Alert("Medical"));

        Predicate<Alert> emergencyOnly = alert -> alert.type.equals("EMERGENCY");

        alerts.stream().filter(emergencyOnly).forEach(a -> System.out.println(a.type));
    }
}
