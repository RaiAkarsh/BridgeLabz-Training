import java.util.*;
class product{
    double price;
    double rating;
    double discount;

    product(double price, double rating, double discount){
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

public class CustomSorting {
    public static void main(String[] args) {
        
        List<product> products = new ArrayList<>();
        products.add(new product(299.99, 4.5, 10));
        products.add(new product(199.99, 4.0, 15));
        products.add(new product(399.99, 4.8, 5));
        products.add(new product(149.99, 3.5, 20));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        for(product p : products){
            System.out.println("Price: " + p.price + ", Rating: " + p.rating + ", Discount: " + p.discount);
        }
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        for(product p : products){
            System.out.println("Price: " + p.price + ", Rating: " + p.rating + ", Discount: " + p.discount);
        }
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        for(product p : products){
            System.out.println("Price: " + p.price + ", Rating: " + p.rating + ", Discount: " + p.discount);
        }
    }
}
