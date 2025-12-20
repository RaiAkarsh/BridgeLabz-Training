import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter a number");
        long number = x.nextLong();

        long temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number > 0) {
            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
