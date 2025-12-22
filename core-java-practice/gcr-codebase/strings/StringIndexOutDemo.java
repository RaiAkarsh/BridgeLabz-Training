import java.util.Scanner;

public class StringIndexOutDemo {

    public static void generate(String text) {
        System.out.println(text.charAt(text.length()));
    }


    public static void handle(String text) {
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
        generate(text);
        handle(text);

    }
}
