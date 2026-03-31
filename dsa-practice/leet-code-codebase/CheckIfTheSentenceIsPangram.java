import java.util.*;
public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = x.nextLine();
        if (checkIfPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }

}
