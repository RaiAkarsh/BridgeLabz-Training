import java.util.*;
public class CountTheDigits {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = x.nextInt();
        System.out.println("Number of digits in the number that divide the number are: " + countDigits(num));
    }
    public static int countDigits(int num) {
        int count=0;
        int n=num;
        while(n>0){
            int rem=n%10;
            if(num%rem==0){
                count++;
            }
            n/=10;
        }
        return count;
        
    }
}

