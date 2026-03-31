import java.util.Scanner;
public class ReplaceWords {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = x.nextLine();
        System.out.println("Enter the word to be replaced and the new word");
        String oldWord = x.next();
        String newWord = x.next();
        String result = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord + " ";
            } else {
                result += words[i] + " ";
            }
        }
        System.out.println("Modified sentence  " + result.trim());
    }
    
}
