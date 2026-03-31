import java.util.*;
public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num<=0){
            System.out.print("The number "+num+" is not a natural number");
            
        }
        else{
            int sum=num*(num+1)/2;
            System.out.print("The sum of "+num+" natural numbers is "+sum);
        }
    }
    
}
