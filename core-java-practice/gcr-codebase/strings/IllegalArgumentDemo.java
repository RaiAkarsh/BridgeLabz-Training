import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled!");
            System.out.println("Start index is greater than end index");
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = x.next();
        System.out.println();

        System.out.println("Generating IllegalArgumentException");
        generateException(text);

        System.out.println("Handling IllegalArgumentException");
        handleException(text);

    }
}
