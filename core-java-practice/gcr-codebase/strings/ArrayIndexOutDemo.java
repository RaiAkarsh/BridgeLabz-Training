import java.util.Scanner;

public class ArrayIndexOutDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled!");
            System.out.println("Index accessed beyond the array length");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled!");
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of names");
        int n = x.nextInt();

        String[] names = new String[n];

        System.out.println("Enter names");
        for (int i = 0; i < n; i++) {
            names[i] = x.next();
        }
        System.out.println();

        System.out.println("Generating ArrayIndexOutOfBoundsException");
        generateException(names);

        System.out.println("Handling ArrayIndexOutOfBoundsException");
        handleException(names);

    }
}
