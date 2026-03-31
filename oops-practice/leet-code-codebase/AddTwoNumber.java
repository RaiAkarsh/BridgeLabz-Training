import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = x.nextInt();
        System.out.println("Enter second number: ");
        int num2 = x.nextInt();
        int sums=sum(num1,num2);
        System.out.println("The sum of two numbers is: " + sums);
    }
    public static  int sum(int num1, int num2) {
        return num1 + num2;
    }
}
