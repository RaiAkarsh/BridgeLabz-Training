import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int number= x.nextInt();
        if(number<0){
            System.out.println("Enter a positive integer");
            return;
        }
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    
}
