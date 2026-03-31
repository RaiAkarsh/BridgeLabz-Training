import java.util.*;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num%5==0){
            System.out.print( "Is the number "+num+" divisible by 5? Yes");
        }
        else{
            System.out.print( "Is the number "+num+" divisible by 5? No");
        }
    }
    
}
