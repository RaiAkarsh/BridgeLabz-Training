import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int number= x.nextInt();
        int originalNumber= number;
        int sum=0;
        while(originalNumber!=0){
            int rem= originalNumber %10;
            sum+= rem*rem*rem;
            originalNumber/=10;
        }
        if(sum == number){
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
    
}
