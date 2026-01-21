import java.util.*;
abstract class WarehouseItem {
    private String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}
class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

class WarehouseUtil {
    static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }
}
