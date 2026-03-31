public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            calculate2();
        }
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
    public static void calculate1() {
        int a = 10 / 0;
    }
    public static void calculate2() {
        calculate1();
    }
}
