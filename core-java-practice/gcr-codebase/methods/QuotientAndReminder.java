import java.util.*;
public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the  dividend and divisor");
        int num1 =x.nextInt();
        int num2 =x.nextInt();
        QuotientAndReminder n =  new QuotientAndReminder();
        int ans[] = n.calculate(num1, num2);
        System.out.println("Quotient " + ans[0] + ", Remainder " + ans[1]);
    }
    int[] calculate(int num1, int num2){
        int result[] =new int[2];
        result[0]= num1 / num2; 
        result[1]= num1 % num2; 
        return result;
    }
}   