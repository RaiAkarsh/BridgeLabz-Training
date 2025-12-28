import java.util.*;
public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = x.nextInt();
        int b = x.nextInt();
        int gcd = GCD(a, b);
        int lcm = LCM(a, b, gcd);
        System.out.println("GCD is " + gcd);
        System.out.println("LCM is " + lcm);
    }
    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int LCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
