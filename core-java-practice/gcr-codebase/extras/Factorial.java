import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = x.nextInt();
        int result = fact(n);
        System.out.println("Factorial of " + n + " is " + result); 
    }
    static int fact(int n){
        if(n==1 ||n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
