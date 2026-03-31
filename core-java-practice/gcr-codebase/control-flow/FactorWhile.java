import java.util.*;
public class FactorWhile {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num<=0){
            System.out.print("Input should be a positive integer");
            return;
        }
        int i=1;
        while(i<num){
            if(num%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
    
}
