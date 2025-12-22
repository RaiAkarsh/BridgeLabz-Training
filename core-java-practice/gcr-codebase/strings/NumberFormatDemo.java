import java.util.Scanner;

public class NumberFormatDemo {

    public static void generate(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    public static void handle(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled!");
            System.out.println("Input is not a valid number");
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a value");
        String text = x.next();
        System.out.println();
        generate(text);
        handle(text);

    }
}
