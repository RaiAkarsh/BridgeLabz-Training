import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = x.nextLine();
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Capitalized Word: " + matcher.group());
        }
    }
    
}
