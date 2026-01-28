import java.util.*;
public class SmartCheckOutMain {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        SmartCheckOutFunc checkout = new SmartCheckOutFunc();
        System.out.println("Welcome to SmartCheckout System");
        System.out.println("Initializing item price and stock data...");
        checkout.addItemToPriceAndStock("apple", 3, 50);
        checkout.addItemToPriceAndStock("banana", 1, 100);
        checkout.addItemToPriceAndStock("orange", 2, 80);
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Customer to Queue");
            System.out.println("2. Remove Customer from Queue");
            System.out.println("3. Fetch Item Price");
            System.out.println("4. Update Stock on Purchase");
            System.out.println("5. View Stock");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = x.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = x.next();
                    Customer customer = new Customer(name);
                    System.out.print("Enter number of items to add: ");
                    int itemCount = x.nextInt();
                    for (int i = 0; i < itemCount; i++) {
                        System.out.print("Enter item name: ");
                        String itemName = x.next().toLowerCase();
                        System.out.print("Enter quantity: ");
                        int qty = x.nextInt();
                        customer.additems(itemName, qty);
                    }
                    checkout.addCustomerToQueue(customer);
                    System.out.println("Customer added to queue.");
                    break;
                case 2:
                    Customer servedCustomer = checkout.removeCustomerFromQueue();
                    if (servedCustomer != null) {
                        System.out.println("Served Customer: " + servedCustomer.name);
                    } else {
                        System.out.println("No customers in queue.");
                    }
                    break;
                case 3:
                    System.out.print("Enter item name to fetch price: ");
                    String itemToFetch = x.next().toLowerCase();
                    int price = checkout.fetchItemPrice(itemToFetch);
                    if (price != -1) {
                        System.out.println("Price of " + itemToFetch + ": " + price);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter item name to update stock: ");
                    String itemToUpdate = x.next().toLowerCase();
                    System.out.print("Enter quantity purchased: ");
                    int qtyPurchased = x.nextInt();
                    checkout.updateStockOnPurchase(itemToUpdate, qtyPurchased);
                    System.out.println("Stock updated for " + itemToUpdate);
                    break;
                case 5:
                    System.out.println("Current Stock:");
                    for (Map.Entry<String, Integer> st : checkout.stockMap.entrySet()) {
                        System.out.println(st.getKey() + ": " + st.getValue());
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting SmartCheckout System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
