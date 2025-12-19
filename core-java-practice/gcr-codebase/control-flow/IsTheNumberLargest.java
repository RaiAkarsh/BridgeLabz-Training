import java.util.*;
public class IsTheNumberLargest {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num1=x.nextInt();
        int num2=x.nextInt();
        int num3=x.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.print("The largest number is "+num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.print("The largest number is "+num2);
        }
        else{
            System.out.print("The largest number is "+num3);
        }
    }
    
}
