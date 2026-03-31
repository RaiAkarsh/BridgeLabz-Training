import java.util.Scanner;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        System.out.println("Enter a number "); 
        int number = x.nextInt();
        boolean isPrime = isPrimeNumber(number);
        boolean isNeon = isNeonNumber(number);
        boolean isSpy = isSpyNumber(number);
        boolean isAutomorphic = isAutomorphicNumber(number);
        boolean isBuzz = isBuzzNumber(number);
//       ------- Displaying the results -------

        System.out.println("Is Prime Number: " + isPrime);
        System.out.println("Is Neon Number: " + isNeon);
        System.out.println("Is Spy Number: " + isSpy);
        System.out.println("Is Automorphic Number: " + isAutomorphic);
        System.out.println("Is Buzz Number: " + isBuzz);
    }
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { 
            if (number % i == 0) { 
                return false;
            }
        }
        return true;
    }
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10; //adding the last digit of the square to sum
            square /= 10;
        }
        return sum == number; // checking if the sum of digits of square is equal to the number itself
    }
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit; // adding the last digit to sum
            product *= digit; // multiplying the last digit to product
            number /= 10;
        }
        return sum == product; 
    }
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number); // converting number to string for easy comparison
        String squareStr = String.valueOf(square); 
        return squareStr.endsWith(numberStr); // checking if the square ends with the number itself
    }
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7; // checking if the number is divisible by 7 or ends with 7
    }
}
