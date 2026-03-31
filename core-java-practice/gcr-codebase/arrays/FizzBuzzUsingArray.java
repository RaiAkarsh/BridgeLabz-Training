import java.util.Scanner;
public class FizzBuzzUsingArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        String[] fizzBuzzArray = new String[n+1];
        
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            } else {
                fizzBuzzArray[i] = Integer.toString(i);
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(fizzBuzzArray[i]);
        }
    }
    
}
