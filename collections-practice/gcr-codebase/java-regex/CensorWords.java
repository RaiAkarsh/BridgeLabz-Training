import java.util.*;
import java.util.regex.*;

public class CensorWords {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = x.nextLine();
        String regex = "\\b(damn|stupid)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.replaceAll("****"));
    }
}
