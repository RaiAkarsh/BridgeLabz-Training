public class FibonacciComparison {

    public static int recursiveFib(int n) {
        if (n <= 1) return n;
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    public static int iterativeFib(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 40;

        long start = System.nanoTime();
        System.out.println("Recursive Result: " + recursiveFib(n));
        long end = System.nanoTime();
        System.out.println("Recursive Time: " + (end-start)/1e6 + " ms");

        start = System.nanoTime();
        System.out.println("Iterative Result: " + iterativeFib(n));
        end = System.nanoTime();
        System.out.println("Iterative Time: " + (end-start)/1e6 + " ms");
    }
}
