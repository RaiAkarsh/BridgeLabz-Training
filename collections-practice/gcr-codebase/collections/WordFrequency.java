import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter text:");
        String inputText = x.nextLine().toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = inputText.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words)
            if (!word.isEmpty())
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        System.out.println(wordCount);
    }
}