import java.util.*;
public class RemoveDuplicatesString {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = x.nextLine();
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                result.append(ch);
                set.add(ch);
            }
        }
        System.out.println("String without duplicates: " + result.toString());
    }
}
