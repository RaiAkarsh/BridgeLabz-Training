import java.util.Scanner;
public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = x.nextLine();
        System.out.println("Enter the character to remove");
        char remove = x.nextLine().charAt(0);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) {
                result += str.charAt(i);
            }
        }
        System.out.println("String after removing " + remove + ": " + result);
    }
    
}
