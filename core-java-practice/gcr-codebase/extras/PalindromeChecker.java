import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome");
        String str = x.nextLine();
        String result = check(str);
        System.out.println(str + " is " + result);
    }
    static String check(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        if (str.equals(rev.toString())) {
            return "a palindrome";
        } 
        else {
            return "not a palindrome";
        }
    }
}
