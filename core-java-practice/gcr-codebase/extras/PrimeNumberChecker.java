import java.util.*;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime");
        int num = x.nextInt();
        String result = check(num);
        System.out.println(num + " is " + result);
    }
    static String check(int num) {
        if (num <= 1) {
            return "not prime";
        }
        for (int i =2; i <=Math.sqrt(num); i++) {
            if (num % i==0) {
                return "not prime";
            }
        }
        return "prime";
    }
    
}
