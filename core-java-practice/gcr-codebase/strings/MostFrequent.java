import java.util.Scanner;
public class MostFrequent {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string to find the most frequent character");
        String str = x.nextLine();
        int maxCount = 0;
        char mostfreq = ' ';
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currChar) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostfreq = currChar;
            }
        }
        System.out.println("most frequent character is " + mostfreq );
    }
    
}
