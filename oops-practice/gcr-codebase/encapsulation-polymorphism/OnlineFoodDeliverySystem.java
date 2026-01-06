interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    abstract double calculateTotalPrice(); 
    void getItemDetails() { 
        System.out.println("Item Name : " + itemName);
        System.out.println("Total Price : " + price);
        System.out.println("Quantity : " + quantity);
    }
}
class VegItem extends FoodItem {
    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }
    public String getDiscountDetails() {
        return "10% discount on Veg Item";
    }
}
class NonVegItem extends FoodItem {
    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.15;
    }
    public String getDiscountDetails() {
        return "15% discount on Non-Veg Item";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem fi1 = new VegItem("Aloo matar", 120, 2);
        FoodItem fi2 = new NonVegItem("Chicken Masala", 360, 1);
        FoodItem[] order = { fi1, fi2 };
        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("----------------------");
        }
    }
}
