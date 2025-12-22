import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generate(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handle(String text) {
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
        generate(text);
        handle(text);

    }
}
