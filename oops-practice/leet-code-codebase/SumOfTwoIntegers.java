import java.util.Scanner;

public class SumOfTwoIntegers {
        public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = x.nextInt();
        System.out.println("Enter second number: ");
        int num2 = x.nextInt();
        int sums=getSum(num1,num2);
        System.out.println("The sum of two numbers is: " + sums);
    }
       public static  int getSum(int a, int b) {
        int n=a^b;
        int carry=a&b;
        if(carry==0){
            return n;
        }
        else{
            return getSum(n,carry<<1);
        }
    }
}

