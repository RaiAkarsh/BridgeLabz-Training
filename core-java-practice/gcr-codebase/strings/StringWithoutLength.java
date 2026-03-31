import java.util.Scanner;

public class StringWithoutLength {

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

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string without any spaces");
        String text = x.next();

        int manualLength = findLength(text);

        System.out.println("Manual Length   : " + manualLength);
    }
}
