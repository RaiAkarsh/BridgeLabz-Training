import java.util.Scanner;
import java.util.regex.*;

public class ValidateAHexColorCode {
        public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter hex color code: ");
        String input = x.nextLine();
        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.println("Valid Hex Color Code: " + matcher.group());
        else
            System.out.println("Invalid Hex Color Code");
    }
}
