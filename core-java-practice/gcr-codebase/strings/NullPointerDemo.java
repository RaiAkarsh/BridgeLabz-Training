public class NullPointerDemo {

    public static void generate() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handle() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled!");
            System.out.println("Trying to access a method on a null object");
        }
    }

    public static void main(String[] args) {
        generate();
        handle();

    }
}
