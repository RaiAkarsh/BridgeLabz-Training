interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private int price;

    Product (String productId , String name, int price ) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public String getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    abstract double calculateDiscount();
    double calculateTax() {
        return 0;
    }
    void displayFinalPrice() {
        double finalPrice = price + calculateTax() - calculateDiscount();
        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + name);
        System.out.println("Base Price : " + price);
        System.out.println("Discount : " + calculateDiscount());
        System.out.println("Tax : " + calculateTax());
        System.out.println("Final Price : " + finalPrice);
        System.out.println("---------------------------");
    }
}
class Electronics extends Product implements Taxable {
    Electronics(String id, String name, int price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return getPrice() * 0.10;
    }
    public double calculateTax() {
        return getPrice() * 0.18;
    }
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    Clothing(String id, String name, int price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return getPrice() * 0.20;
    }
    public double calculateTax() {
        return getPrice() * 0.05;
    }
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Groceries extends Product {
    Groceries(String id, String name, int price) {
        super(id, name, price);
    }
    double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product pro1 = new Electronics("121", "Ps5", 150000);
        Product pro2 = new Clothing("122", "T-Shirt", 2000);
        Product pro3 = new Groceries("123", "Loafers", 1200);
        Product[] product = { pro1, pro2, pro3 };
        for (Product p : product) {
            p.displayFinalPrice();
        }
    }
}
