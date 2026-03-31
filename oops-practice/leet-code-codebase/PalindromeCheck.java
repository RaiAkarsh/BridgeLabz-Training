import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        boolean result = isPalindrome(number);
        System.out.println("Is the number " + number + " a palindrome? " + result);
    }
        public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int  num= x;

        while (num!= 0) {
            rev= rev*10 + num%10;
            num=num/10;
        }

        return (rev == x);
    }
}
