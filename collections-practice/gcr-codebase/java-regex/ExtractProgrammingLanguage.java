import java.util.Scanner;
import java.util.regex.*;
public class ExtractProgrammingLanguage {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = x.nextLine();
        String regex = "\\b(Java|Python|Go|JavaScript)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Programming Language: " + matcher.group());
        }
    }
}