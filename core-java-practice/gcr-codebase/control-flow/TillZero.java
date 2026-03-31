import java.util.*;
public class TillZero {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        double number=x.nextDouble();
        double sum=0.0;
        while(number>0){
            sum+=number;
            number=x.nextDouble();
        }
        System.out.println("Sum " + sum);
    }
    
}
