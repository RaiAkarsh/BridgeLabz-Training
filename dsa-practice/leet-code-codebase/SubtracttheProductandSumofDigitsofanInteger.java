import java.util.Scanner;

public class SubtracttheProductandSumofDigitsofanInteger {
        public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = x.nextInt();
        SubtracttheProductandSumofDigitsofanInteger sp = new SubtracttheProductandSumofDigitsofanInteger();
        System.out.println(sp.subtractProductAndSum(n));
    }
        public int subtractProductAndSum(int n) {
        int product =1,sum=0;
        while(n>0){
            product*=n%10;
            sum+=n%10;
            n/=10;
        }
        return product - sum;
        
    }
    
}
