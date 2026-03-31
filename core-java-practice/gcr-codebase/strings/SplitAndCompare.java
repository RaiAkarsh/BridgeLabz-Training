import java.util.Scanner;

public class SplitAndCompare {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] manualSplit(String str) {

        int length = findLength(str);
        int words = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        int[] spaceIndex = new int[words + 1];
        int idx = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[0] = -1;
        spaceIndex[words] = length;

        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += str.charAt(j);
            }
            result[i] = word;
        }

        return result;
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string with spaces");
        String text = x.nextLine();

        String[] manual = manualSplit(text);
        String[] builtIn = text.split(" ");

        boolean result = compare(manual, builtIn);

        System.out.println("Are both results equal? \n" + result);
    }
}
