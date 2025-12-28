import java.util.*;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci sequence");
        int n = x.nextInt();
        fib(n);
}
    static void fib(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}