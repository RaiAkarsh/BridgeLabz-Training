import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int number= x.nextInt();
        int sum=0;
        int originalNumber= number;
        while(originalNumber!=0){
            int rem= originalNumber %10;
            sum+= rem;
            originalNumber/=10;
        }
        if(number % sum == 0){
            System.out.println(number + " is a Harshad number");
        } else {
            System.out.println(number + " is not a Harshad number");
        }
    }
    
}
