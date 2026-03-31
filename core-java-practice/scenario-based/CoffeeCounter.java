import java.util.*;
public class CoffeeCounter{
    public static void main(String[] args){
       Scanner x=new Scanner(System.in);
       String coffeeType;
         int quantity;
         double bill=0.0;
         while(true){
            System.out.println("Enter coffee type (Espresso/Latte/Cappuccino) or 'exit' to finish:");
            coffeeType=x.next().toLowerCase();
            if(coffeeType.equals("exit")){
                break;
            }
            System.out.println("Enter quantity:");
            quantity=x.nextInt();
            double price=0.0;
            switch ((coffeeType)) {
                case "espresso":
                    price=150;
                    break;
                case "latte":
                    price=200;
                    break;
                case "cappuccino":
                    price=250;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;        
            }
            if(!coffeeType.equals("exit")){
                bill +=price*quantity;
                continue;
            }
        }
            System.out.println("Total bill before GST: " + bill);
            double gst=bill*0.18;
            System.out.println("GST (18%): " + gst);
            double totalAmount=bill+gst;
            System.out.println("Total amount to be paid: " + totalAmount);
         
    }
}