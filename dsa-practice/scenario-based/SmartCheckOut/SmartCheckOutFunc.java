import java.util.*;
class Customer {
    String name;
    Map<String, Integer> items;

    public Customer(String name) {
        this.name = name;
        this.items = new HashMap<>();
    }

    void additems(String item,int qty){
        items.put(item, qty);
    }
}
public class SmartCheckOutFunc {
    Queue<Customer> checkoutQueue;
    Map<String, Integer> priceMap;
    Map<String, Integer> stockMap;

    public SmartCheckOutFunc() {
        checkoutQueue = new LinkedList<>();
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }

    void addItemToPriceAndStock(String item, int price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    void addCustomerToQueue(Customer customer) {
        checkoutQueue.add(customer);
    }

    Customer removeCustomerFromQueue() {
        return checkoutQueue.poll();
    }

    int fetchItemPrice(String item) {
        return priceMap.getOrDefault(item, -1);
    }

    void updateStockOnPurchase(String item, int quantity) {
        if (stockMap.containsKey(item)) {
            int currentStock = stockMap.get(item);
            stockMap.put(item, Math.max(0, currentStock - quantity));
        }
    }
}

