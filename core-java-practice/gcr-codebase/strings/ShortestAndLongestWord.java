import java.util.Scanner;

public class ShortestAndLongestWord {

    public static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    public static int[] shortestLongest(String[] words) {

        int min = findLength(words[0]);
        int max = findLength(words[0]);

        for (int i = 1; i < words.length; i++) {
            int len = findLength(words[i]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a String");
        String text = x.nextLine();

        String[] words = text.split(" ");
        int[] result = shortestLongest(words);

        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length : " + result[1]);
    }
}
