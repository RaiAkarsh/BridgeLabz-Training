import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = x.nextLine();
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome");
        }
        else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}

