import java.util.Scanner;
public class FirstNonRepetingChar {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = x.nextLine();

        char result=' ';
        boolean unique = false;

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            boolean repeat = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && curr == str.charAt(j)) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                result = curr;
                unique = true;
                break;
            }
        }

        if (unique) {
            System.out.println("First non-repeating character " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
    

