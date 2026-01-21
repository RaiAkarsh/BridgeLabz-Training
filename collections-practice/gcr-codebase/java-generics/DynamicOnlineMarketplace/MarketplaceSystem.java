import java.util.*;
abstract class Category {
    abstract String getCategoryName();
}

class BookCategory extends Category {
    String getCategoryName() {
        return "Book";
    }
}
class ClothingCategory extends Category {
    String getCategoryName() {
        return "Clothing";
    }
}

class Product<T extends Category> {

    private String name;
    private double price;
    private T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    void display() {
        System.out.println(
            name + " | " + category.getCategoryName() + " | Price: " + price);
    }
}

class MarketplaceUtil {

    static void displayAll(List<? extends Product<?>> products) {
        for (Product<?> p : products) {
            p.display();
        }
    }
}
