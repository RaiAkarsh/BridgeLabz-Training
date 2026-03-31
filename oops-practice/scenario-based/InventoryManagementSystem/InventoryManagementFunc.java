import java.util.*;
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
interface AlertService {
    void sendAlert(String name);
}

class Product {
    int productId;
    String name;
    int quantity;

    public Product(int productId, String name, int quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
    }
}

class Inventory implements AlertService{
   private List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void updateStock(int productId , int qty) throws OutOfStockException{
        for (Product p : products) {
            if (p.productId == productId) {
                p.quantity += qty;
                if (p.quantity < 0) {
                    throw new OutOfStockException("Out of stock!");
                }

                if(p.quantity < 5) {
                    sendAlert(p.name);
                }
            }
        }
    }

    void showInventory() {
        for (Product p : products) {
            System.out.println("ID: " + p.productId + " Name: " + p.name + " Quantity: " + p.quantity);
        }
    }

    public void sendAlert(String name) {
        System.out.println(name + " is low in stock!");
    }
}