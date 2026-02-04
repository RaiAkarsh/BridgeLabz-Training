import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(134.5);
        prices.add(136.75);
        prices.add(133.9);
        prices.forEach(p -> System.out.println(p));
    }
}