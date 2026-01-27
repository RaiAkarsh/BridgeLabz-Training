import java.util.*;
public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        try {
            System.out.println("Enter the no. to divide");
            int a = x.nextInt();
            int b = x.nextInt();
            System.out.println("Result : " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
