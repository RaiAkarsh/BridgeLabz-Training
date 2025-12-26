import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        System.out.println("Enter a number "); 
        int number = x.nextInt();
        int count = countD(number);
        int[] digits = storeDigits(number, count);
        int sum[] = Sum(digits);
        boolean isHarshad = isHarshadNumber(number, sum[0]);
        int[][] frequency = Frequency(digits);
        System.out.println("Number of digits " + count);
        System.out.println("Sum of digits " + sum[0]);
        System.out.println("Sum of squares of digits " + sum[1]);
        System.out.println("Is Harshad Number " + isHarshad);
        System.out.println("Digit Frequency ");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "  " + frequency[i][1]);
        }
    }
    public  static int countD(int number) {
        return String.valueOf(number).length();
    }
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count]; 
        for (int i = count - 1; i >= 0; i--) { 
            digits[i] = number % 10; 
            number /= 10; 
        }
        return digits;
    }
    public static int[] Sum(int[] digits) {
        int[] sum = new int[2];
        for (int digit : digits) { 
            sum[0] += digit;
            sum[1] += digit * digit;
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int sumD) {
        return number % sumD == 0; 
    }
    public static int[][] Frequency(int[] digits) {
        int[][] frequency = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
            frequency[i][1] = 0; 
        }
        for (int digit : digits) {
            frequency[digit][1]++;  
        }
        return frequency;
    }
}
