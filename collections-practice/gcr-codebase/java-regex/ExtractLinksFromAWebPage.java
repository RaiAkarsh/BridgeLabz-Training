import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromAWebPage {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = x.nextLine();
        String regex = "https?://[^\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Link: " + matcher.group());
        }
    }
}
