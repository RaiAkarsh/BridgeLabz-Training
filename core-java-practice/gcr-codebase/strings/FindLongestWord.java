import java.util.Scanner;
public class FindLongestWord {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a sentence to find the longest word");
        String sentence = x.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i=0; i<words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
    
}
