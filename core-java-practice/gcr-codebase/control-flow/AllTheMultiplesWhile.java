import java.util.*;
public class AllTheMultiplesWhile {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
         if(num >0 && num <=100){
            int i=num;
            while(i>0){
                if(num%i==0){
                    System.out.println(i);
                }
                i--;
            }
        }
        else{
            System.out.print("Input should be a positive integer between 1 and 100");
        }
    }
    
}
