import java.util.*;
import java.util.regex.*;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = x.nextLine();

        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.replaceAll(" "));
    }
}
