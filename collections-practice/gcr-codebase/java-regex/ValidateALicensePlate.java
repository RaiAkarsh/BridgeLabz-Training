import java.util.*;
import java.util.regex.*;
public class ValidateALicensePlate {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter license plate: ");
        String input = x.nextLine();
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.println("Valid License Plate: " + matcher.group());
        else
            System.out.println("Invalid License Plate");
    }
}
