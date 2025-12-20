import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        if(number <= 1){
            System.out.println(number + " is not a prime number");
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
    
}
