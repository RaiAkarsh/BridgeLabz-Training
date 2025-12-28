import java.util.*;
public class NumberGuessingGame {
    static int low=1,high=100;
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100");
        int guess=0;
        while (true) {
             guess = (int)(Math.random() * (high - low + 1)) + low;
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter high ,low or correct");
            String res=x.nextLine().toLowerCase();
            if (res.equals("correct")) {
                System.out.println("congrats " + guess);
                break;
            }
            update(res, guess);
        }
    }
    static void update(String res, int guess) {
        if (res.equals("high")) {
            high = guess - 1;
        }
         else {
          low = guess + 1;
        } 
    }
    
}
