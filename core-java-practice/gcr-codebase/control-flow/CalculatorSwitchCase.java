import java.util.*;
public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        double first= x.nextDouble();
        double second= x.nextDouble();
        char operator= x.next().charAt(0);
        double sum=0.0;
        switch(operator){
            case '+':
                sum= first + second;
                break;
            case '-':
                sum= first - second;
                break;
            case '*':
                sum= first * second;
                break;
            case '/':
                sum= first / second;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result " + sum);
    }
    
}
