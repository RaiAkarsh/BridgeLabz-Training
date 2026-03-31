import java.util.Scanner;
public class CheckNumberForPositiveEvenAndOddAndNegative {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a  5 number");
        int number[] = new int[5];
        CheckNumberForPositiveEvenAndOddAndNegative c = new CheckNumberForPositiveEvenAndOddAndNegative();
        for(int i=0;i<5;i++){
            number[i] = x.nextInt();
            c.check(number[i]);
        }
        String result =c.compare(number[0],number[4]);
        System.out.println(result);
    }
    void check(int number){
        if(number>0){
            if(number%2==0){
                System.out.println(number + " is positive even number");
            } else {
                System.out.println(number + " is positive odd number");
            }
        } else {
            System.out.println(number + " is negative number");
        }
    }
    String compare(int first,int last){
        if(first>last){
            return first + " is greater than " + last;
        } else if(last>first){
            return first + " is smaller than " + last;
        } else {
            return first + " is equal to " + last;
        }
    }
    
}
