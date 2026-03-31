import java.util.*;
import java.util.regex.*;
public class SSNValidation {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter SSN: ");
        String input = x.nextLine();

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches())
            System.out.println("Valid SSN: " + matcher.group());
        else
            System.out.println("Invalid SSN");
    }
}
