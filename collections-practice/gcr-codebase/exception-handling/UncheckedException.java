import java.util.*;
public class UncheckedException {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        try {
            System.out.println("enter no. to divide:");
            int a = X.nextInt();
            int b = X.nextInt();
            System.out.println("Result: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers");
        }
    }
}
