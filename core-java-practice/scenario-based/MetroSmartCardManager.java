import java.util.*;
public class MetroSmartCardManager {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("Enter card balance");
        double balance =x.nextDouble();
        while (true) {
            if (balance<=0) {
                System.out.println("Balance exhausted");
                break;
            }
            System.out.println("Enter distance travelled or 'exit' to quit");
            String input =x.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            } 
            else {
                int distance =Integer.parseInt(input);
                int fare = (distance <= 5) ? 10 :(distance <= 10) ? 20 : 30;
                if (balance >= fare) {
                    balance = balance - fare;
                    System.out.println("Fare deducted " + fare);
                    System.out.println("Remaining balance " + balance);
                } 
                else {
                    System.out.println("Insufficient balance for this journey");
                    break;
                }
            }
        }
    }
}
