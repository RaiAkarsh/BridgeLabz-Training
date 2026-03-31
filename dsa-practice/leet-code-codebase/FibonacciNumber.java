import java.util.*;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = x.nextInt();
        System.out.println("fibonacci is "+fib(n));
    }
        public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int a=0,b=1,c=0;
        int count=1;
        while(count<n){
            c=a+b;
            a=b;
            b=c;
            count++;
        }
        return c;
        
    }
}
