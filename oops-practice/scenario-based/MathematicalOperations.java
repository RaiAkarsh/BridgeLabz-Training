import java.util.Scanner;
public class MathematicalOperations {
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public static long fibonacci(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            long prev = 0, curr = 1;
            for (int i = 2; i <= n; i++) {
                long next = prev + curr;
                prev = curr;
                curr = next;
            }
            return curr;
        }
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("=== Mathematical Operations ===");
        
        System.out.print("Enter a number for Factorial: ");
        int num1 = x.nextInt();
        System.out.println("Factorial of " + num1 + ": " + factorial(num1));
        
        System.out.print("Enter a number to check Prime: ");
        int num2 = x.nextInt();
        System.out.println("Is " + num2 + " Prime: " + isPrime(num2));
        
        System.out.print("Enter first and second number for GCD: ");
        int a = x.nextInt();
        int b = x.nextInt();
        System.out.println("GCD of " + a + " and " + b + ": " + gcd(a, b));
        
        System.out.print("Enter position for Fibonacci: ");
        int pos = x.nextInt();
        System.out.println("Fibonacci at position " + pos + ": " + fibonacci(pos));
    }
}