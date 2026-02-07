import java.util.*;
import java.util.stream.*;

class Order {
    private String customer;
    private double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    String getCustomer() { 
        return customer; 
    }
    
    double getAmount() { 
        return amount; 
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Akarsh", 500));
        orders.add(new Order("Arsh", 300));
        orders.add(new Order("Akarsh", 700));

        Map<String, Double> revenue = orders.stream().collect(Collectors.groupingBy(Order::getCustomer,Collectors.summingDouble(Order::getAmount)));

        System.out.println(revenue);
    }
}
