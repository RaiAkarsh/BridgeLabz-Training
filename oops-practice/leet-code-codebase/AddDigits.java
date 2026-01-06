import java.util.*;
public class AddDigits {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        System.out.println("The result after adding digits of " + num + " is: " + addDigits(num));
    }
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
