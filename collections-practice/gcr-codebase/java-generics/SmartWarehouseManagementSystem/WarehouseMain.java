import java.util.*;

public class WarehouseMain {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Storage<WarehouseItem> storage = new Storage<>();

        while (true) {
            System.out.println("\n1.Add Item");
            System.out.println("2.View Items");
            System.out.println("3.Exit");

            int choice = x.nextInt();
            x.nextLine();
            switch (choice) {

                case 1:
                    System.out.println("1.Electronics 2.Groceries 3.Furniture");
                    int type = x.nextInt();
                    x.nextLine();

                    System.out.print("Enter item name: ");
                    String name = x.nextLine();

                    if (type == 1)
                        storage.addItem(new Electronics(name));
                    else if (type == 2)
                        storage.addItem(new Groceries(name));
                    else if (type == 3)
                        storage.addItem(new Furniture(name));
                    else
                        System.out.println("Invalid type");
                    break;

                case 2:
                    WarehouseUtil.displayItems(storage.getItems());
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
