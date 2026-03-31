import java.util.*;
public class Power {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int number=x.nextInt();
        int power=x.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result*=number;
        }
        System.out.println("The result of number "+number+" with power "+power+" is "+result);
    }
    
}
