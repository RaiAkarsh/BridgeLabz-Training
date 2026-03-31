import java.util.Scanner;
public class ConvertToUpperCase {
    public static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter complete text");
        String text = x.nextLine();
        System.out.println();

        String manualUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        boolean result = compareStrings(manualUpper, builtInUpper);

        System.out.println("Manual Uppercase    " + manualUpper);
        System.out.println("Built-in Uppercase  " + builtInUpper);
        System.out.println("Are both equal?     " + result);
    }
}


