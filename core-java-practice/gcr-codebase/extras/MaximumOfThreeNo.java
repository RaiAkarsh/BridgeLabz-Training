import java.util.*;
public class MaximumOfThreeNo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        int max = check(a, b, c);
        System.out.println("Maximum number is " + max);
    }
    static int check(int a, int b, int c) {
        if (a >=b && a>= c) {
            return a;
        } 
        else if (b >=a && b >=c) {
            return b;
        }
        else {
            return c;
        }
    }
}
