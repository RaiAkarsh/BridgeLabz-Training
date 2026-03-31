import java.util.*;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num<=0){
            System.out.print("Input should be a positive integer");
            return;
        }

        int greatestFactor = 1;
        int i = num - 1;
        
        while(i >= 1){
            if(num % i == 0){
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor of " + num + " except itself is " + greatestFactor);
    }
    
}
