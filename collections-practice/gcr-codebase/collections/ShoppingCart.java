import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        HashMap<String, Integer> productPriceMap = new HashMap<>();
        LinkedHashMap<String, Integer> cartOrder = new LinkedHashMap<>();

        System.out.println("Enter number of products:");
        int productCount = x.nextInt();

        System.out.println("Enter product name and price:");
        for (int i = 0; i < productCount; i++) {
            String productName = x.next();
            int price = x.nextInt();
            productPriceMap.put(productName, price);
            cartOrder.put(productName, price);
        }

        TreeMap<Integer, String> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : cartOrder.entrySet())
            sortedByPrice.put(entry.getValue(), entry.getKey());

        System.out.println("----- Cart Items (Insertion Order) -----");
        System.out.println(cartOrder);

        System.out.println("----- Items Sorted by Price -----");
        System.out.println(sortedByPrice);
    }
}
