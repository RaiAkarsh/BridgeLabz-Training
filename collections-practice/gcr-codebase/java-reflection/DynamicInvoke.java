import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicInvoke {
    public static void main(String[] args) throws Exception {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = x.nextLine();
        System.out.print("Enter first number: ");
        int a = x.nextInt();
        System.out.print("Enter second number: ");
        int b = x.nextInt();
        MathOperations obj = new MathOperations();
        Class<?> cls = obj.getClass();
        Method method = cls.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(obj, a, b);
        System.out.println("Result: " + result);
    }
}
