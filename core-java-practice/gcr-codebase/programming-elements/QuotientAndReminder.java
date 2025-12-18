import java.util.*;
public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num1 = x.nextInt();
        int num2 = x.nextInt();
        int quotient = num1 / num2;
        int reminder = num1 % num2;
        System.out.print("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + num1 + " and " + num2);
    }
    
}
