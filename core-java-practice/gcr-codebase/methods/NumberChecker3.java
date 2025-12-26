import java.util.Scanner;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        System.out.println("Enter a number"); 
        int number = x.nextInt();
        int count = countD(number);
        int[] digits = store(number, count);
        int[] reversed = reverse(digits);
        boolean areEqual = compare(digits, reversed);
        boolean isPalindrome = isPalindrome(areEqual);
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Number of digits: " + count);
        System.out.println("Reversed Digits: ");
        for (int digit : reversed) {
            System.out.print(digit);
        }
        System.out.println("\nAre Original and Reversed arrays equal: " + areEqual);
        System.out.println("Is Palindrome Number: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
    }
    public static int countD(int number) {
        return String.valueOf(number).length();
    }
    public static int[] store(int number, int count) {
        int[] digits = new int[count]; 
        for (int i = count - 1; i >= 0; i--) { 
            digits[i] = number % 10; 
            number /= 10; 
        }
        return digits;
    }
    public static int[] reverse(int[] digits) {
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = digits[n - 1 - i]; 
        }
        return reversed;
    }
    public static boolean compare(int[] digits, int[] reversed) {
        if (digits.length != reversed.length) {
            return false;
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(boolean areEqual) {
        return areEqual; 
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) { 
                return true;
            }
        }
        return false;
    }
}
