import java.util.*;
public class Anagrams {
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.println("Enter the first string and second string");
            String str1 = x.nextLine().toLowerCase().replace(" ", "");
            String str2 = x.nextLine().toLowerCase().replace(" ", "");
            if (str1.length() != str2.length()) {
                System.out.println("Strings are not anagrams.");
                return;
            }
            String str11 = sortstr(str1);
            String str22 = sortstr(str2);
            if (str11.equals(str22)) {
                
                System.out.println("Strings are anagrams.");
            }
            else {
                System.out.println("Strings are not anagrams.");
            }
        }
        public static String sortstr(String str) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
    }

