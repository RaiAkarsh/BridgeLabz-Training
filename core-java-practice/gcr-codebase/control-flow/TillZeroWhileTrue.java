import java.util.*;
public class TillZeroWhileTrue {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        double number;
        double sum=0.0;
        while(true){
            number=x.nextDouble();
            if(number<=0){
                break;
            }
            sum+=number;
        }
        System.out.println("Sum " + sum);
    }
    
}
