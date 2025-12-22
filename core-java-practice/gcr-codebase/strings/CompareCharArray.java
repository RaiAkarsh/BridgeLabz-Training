import java.util.Scanner;

public class CompareCharArray {

    // User-defined method to return characters of a string
    public static char[] getCharsManually(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String text = sc.next();

        char[] manualArray = getCharsManually(text);

        char[] builtInArray = text.toCharArray();

        boolean isSame = compareCharArrays(manualArray, builtInArray);

        System.out.println("Characters using user-defined method");
        for (char ch : manualArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("Characters using toCharArray()");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("Are both character arrays equal? " + isSame);
    }
}
