import java.util.*;
import java.util.stream.*;

class Claim {

    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaim {
    public static void main(String[] args) {
        List<Claim> claims = new ArrayList<>();
        claims.add(new Claim("Health", 20000));
        claims.add(new Claim("Health", 30000));
        claims.add(new Claim("Car", 15000));
        Map<String, Double> averageByType =
                claims.stream().collect(Collectors.groupingBy( c -> c.type,Collectors.averagingDouble(c -> c.amount)));
        averageByType.forEach((type, avg) -> System.out.println(type + " : " + avg));
    }
}
