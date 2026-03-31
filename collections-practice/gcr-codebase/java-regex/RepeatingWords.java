import java.util.Scanner;
import java.util.regex.*;
public class RepeatingWords {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = x.nextLine();
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Repeating Word: " + matcher.group());
        }
    }
}
