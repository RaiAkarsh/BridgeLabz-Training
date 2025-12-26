import java.util.Scanner;
public class LexiographicCompare {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = x.nextLine();
        System.out.println("Enter the second string");
        String str2 = x.nextLine();
         int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 != ch2) {
                if (ch1 < ch2) {
                    System.out.println( str1 + " is lexicographically smaller than " + str2 );
                } else {
                    System.out.println( str1 + " is lexicographically greater than " + str2 );
                }
                return;
            }
        }
        if (str1.length() == str2.length()) {
            System.out.println("Both strings are equal.");
        } else if (str1.length() < str2.length()) {
            System.out.println( str1 + " is lexicographically smaller than " + str2 );
        } else {
            System.out.println( str1 + " is lexicographically greater than " + str2 );
        }
    }
    
}

   