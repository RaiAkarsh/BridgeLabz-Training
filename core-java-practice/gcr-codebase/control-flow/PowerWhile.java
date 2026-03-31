import java.util.*;
public class PowerWhile {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int number= x.nextInt();
        int power=x.nextInt();
        int result=1;
        int i=1;
        while(i<=power){
            result*=number;
            i++;
        }
        System.out.println("The result of number "+number+" with power "+power+" is "+result);
    }
    
}
