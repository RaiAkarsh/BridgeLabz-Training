import java.util.*;
public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = x.nextLine();
        System.out.println("Unique characters");

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {

                if (i != j && curr == str.charAt(j)) {
                    isUnique = false;
                    break;
                    
                }
            }
            if (isUnique) {
                System.out.print(curr + " ");
            }
        }
    }
}