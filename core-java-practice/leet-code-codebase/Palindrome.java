import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Input
        int n = x.nextInt();

        if (n < 0) {
            System.out.println("false");
        } else {
            int rev = 0;
            int num = n;

            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }

            if (rev == n) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        
    }
}
