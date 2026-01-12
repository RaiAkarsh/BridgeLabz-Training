import java.util.*;

public class EventManagerMain {
    public static void main(String[] args) {

        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(500);
        prices.add(200);
        prices.add(800);

        prices.set(0, 450);
        prices.remove(1);

        EventManagerFunc.quickSort(prices, 0, prices.size() - 1);

        for (int p : prices)
            System.out.println(p);
    }
}
