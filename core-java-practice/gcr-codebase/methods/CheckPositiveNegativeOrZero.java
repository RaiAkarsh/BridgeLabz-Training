import java.util.*;
public class CheckPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the number");
        int num =x.nextInt();
        CheckPositiveNegativeOrZero n =  new CheckPositiveNegativeOrZero();
        String ans = n.check(num);
        System.out.println(ans);
    }

    String check(int num){
        if(num>0){
            return "positive";
        }
        else if(num==0){
            return "zero";
        }
        else{
            return "negative";
        }
    }
    
}
