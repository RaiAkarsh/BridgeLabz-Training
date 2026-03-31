import java.util.Scanner;
public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string to toggle characters");
        String str = x.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ans += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                ans += Character.toUpperCase(ch);
            } else {
                ans += ch;
            }
        }
        System.out.println("Toggled string " + ans);
    }
    
}
