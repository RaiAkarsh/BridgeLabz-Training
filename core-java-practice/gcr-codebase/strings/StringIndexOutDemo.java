import java.util.Scanner;

public class StringIndexOutDemo {

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled!");
            System.out.println("Index accessed beyond the string length");
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = x.next();
        System.out.println();

        System.out.println("Generating StringIndexOutOfBoundsException");
        generateException(text);

        System.out.println("Handling StringIndexOutOfBoundsException");
        handleException(text);

    }
}
