import java.util.Scanner;
public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String str = x.nextLine().trim().replaceAll("\\s+", " ");
        System.out.println("Enter the word to replace:");
        String target = x.nextLine();
        System.out.println("Enter the replacement word:");
        String newword = x.nextLine();
        if(str.isEmpty()){
            System.out.println("Empty or null string provided.");
            return;
        }
        String words[] = str.split(" ");
        System.out.println("Word Count: " + words.length);
        String longestWord="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longestWord.length()){
                longestWord=words[i];
            }
        }
        System.out.println("Longest Word: " + longestWord);
        String sentence="";
        for(int i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase(target)){
                sentence+=newword+" ";
            } else {
                sentence+=words[i]+" ";
            }
        }
        System.out.println("Modified Paragraph:");
        System.out.println(sentence.trim());
    }
    
}
