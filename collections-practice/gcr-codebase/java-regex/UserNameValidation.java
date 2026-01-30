import java.util.*;
import java.util.regex.*;

public class UserNameValidation {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter username: ");
        String input = x.nextLine();

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches())
            System.out.println("Valid Username: " + matcher.group());
        else
            System.out.println("Invalid Username");
    }
}
