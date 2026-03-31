import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddresses {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String input = x.nextLine();
        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Email: " + matcher.group());
        }
    }
}
