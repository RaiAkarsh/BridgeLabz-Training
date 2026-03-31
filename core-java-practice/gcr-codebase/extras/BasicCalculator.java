import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter two numbers and + for addition, - for subtraction, * for multiplication, / for division");
        int a = x.nextInt();
        int b = x.nextInt();
        char op = x.next().charAt(0);
        if(op == '+'){
            add(a, b);
        }
        else if(op == '-'){
            subtract(a, b);
        }
        else if(op == '*'){
            multiply(a, b);
        }
        else if(op == '/'){
            divide(a, b);
        }
        else{
            System.out.println("Invalid operator");
        }
    }
    static void add(int a, int b){
        System.out.println("Addition " + (a + b));
    }
    static void subtract(int a, int b){
        System.out.println("Subtraction " + (a - b));
    }
    static void multiply(int a, int b){
        System.out.println("Multiplication " + (a * b));
    }
    static void divide(int a, int b){
        System.out.println("Division " + (a / b));
    }
}

