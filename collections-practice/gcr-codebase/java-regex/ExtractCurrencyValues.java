import java.util.Scanner;
import java.util.regex.*;
public class ExtractCurrencyValues {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = x.nextLine();
        String regex = "\\$?\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Currency Value: " + matcher.group());
        }
    }
}
