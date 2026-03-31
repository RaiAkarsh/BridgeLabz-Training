import java.util.*;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int number= x.nextInt();
        if(number<0){
            System.out.println("Enter a positive integer");
            return;
        }
        int factorial=1;
        int i=1;
        while(i<=number){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    
}
