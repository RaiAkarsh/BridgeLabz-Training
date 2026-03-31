import java.util.Scanner;
import java.util.regex.*;
public class ValidateAnIPAddress {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String input = x.nextLine();
        String regex = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid IP address");
        } else {
            System.out.println("Invalid IP address");
        }
    }
}
