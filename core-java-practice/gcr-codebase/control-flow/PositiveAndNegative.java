import java.util.*;
public class PositiveAndNegative {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int number=x.nextInt();
        if(number>0){
            System.out.print("positive");
        }
        else if(number==0){
            System.out.print("zero");
        }
        else{
            System.out.print("negative");
        }
    }
    
}
