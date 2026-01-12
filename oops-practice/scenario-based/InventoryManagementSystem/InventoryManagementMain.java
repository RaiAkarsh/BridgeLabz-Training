import java.util.*;

public class InventoryManagementMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Inventory inventory = new Inventory();

        int choice = -1;

        while (choice != 0) {
            System.out.println("-----------------------");
            System.out.println("1 Add Product");
            System.out.println("2 Update Stock");
            System.out.println("3 View Inventory");
            System.out.println("0 Exit");
            System.out.println("Enter your choice: ");
            System.out.println("-----------------------");
            choice = x.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.println("Enter ProductId Name Quantity");
                        inventory.addProduct(
                                new Product(x.nextInt(), x.next(), x.nextInt())
                        );
                        break;

                    case 2:
                        System.out.println("Enter ProductId and Quantity Change");
                        inventory.updateStock(x.nextInt(), x.nextInt());
                        break;

                    case 3:
                        inventory.showInventory();
                        break;

                    case 0:
                        System.out.println("Exit");
                }
            } catch (OutOfStockException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
