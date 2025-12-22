import java.util.Scanner;
public class LeadingAndTrailingSpaces {
    public static int[] trimIndex(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ') {
            start++;
        }
        while (text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String subString(String text, int s, int e) {
        String result = "";
        for (int i = s; i <= e; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter text");
        String text = x.nextLine();


        int[] id = trimIndex(text);

        String manualTrim = subString(text, id[0], id[1]);
        String builtInTrim = text.trim();

        System.out.println(manualTrim.equals(builtInTrim));
    }
}

    

