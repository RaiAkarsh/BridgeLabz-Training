import java.util.*;
public class CountDownWhile {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int number=x.nextInt();
        int i=number;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }
    
}
