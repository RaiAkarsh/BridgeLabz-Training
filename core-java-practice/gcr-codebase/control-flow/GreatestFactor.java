import java.util.*;
public class GreatestFactor {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num<=0){
            System.out.print("Input should be a positive integer");
            return;
        }
        int greatestFactor = 1;
        for(int i=num-1; i>=1; i--){
            if(num%i==0){
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor of "+num+" except itself is " + greatestFactor);
    }
    
}
