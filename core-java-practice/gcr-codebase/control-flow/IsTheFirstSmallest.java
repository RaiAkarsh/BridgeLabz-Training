import java.util.Scanner;
public class IsTheFirstSmallest {
     public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int number1=x.nextInt();
        int number2=x.nextInt();
        int number3=x.nextInt();
        if(number1<number2 && number1<number3){
            System.out.print( "Is the first number "+number1+" the smallest? Yes");
        }
        else{
            System.out.print( "Is the first number "+number1+" the smallest? No");
        }
    }
    
}
