import java.util.*;
public class Totalprice {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int unitprice = x.nextInt();
        int quantity = x.nextInt();
        int totalPrice = unitprice * quantity;
        System.out.print("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitprice);
    }
    
}
