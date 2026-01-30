import java.util.Scanner;
import java.util.regex.*;
public class ValidateACreditCardNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String input = x.nextLine();
        String regex = "(^4[0-9]{15}$)|(^5[0-9]{15}$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid credit card number.");
        } else {
            System.out.println("Invalid credit card number.");
        }
    }
}
