import java.util.*;

public class MarketplaceMain {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        List<Product<?>> products = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add Product");
            System.out.println("2.Apply Discount");
            System.out.println("3.View Products");
            System.out.println("4.Exit");

            int choice = x.nextInt();
            x.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("1.Book 2.Clothing");
                    int type = x.nextInt();
                    x.nextLine();

                    System.out.print("Enter product name: ");
                    String name = x.nextLine();

                    System.out.print("Enter price: ");
                    double price = x.nextDouble();

                    if (type == 1)
                        products.add(
                            new Product<>(name, price, new BookCategory())
                        );
                    else if (type == 2)
                        products.add(
                            new Product<>(name, price, new ClothingCategory())
                        );
                    else
                        System.out.println("Invalid category");
                    break;

                case 2:
                    System.out.print("Enter discount %: ");
                    double d = x.nextDouble();

                    for (Product<?> p : products) {
                        p.applyDiscount(d);
                    }
                    break;

                case 3:
                    MarketplaceUtil.displayAll(products);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
