import java.util.Scanner;
public class DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = x.nextInt();
        System.out.println("Enter the divisor m:");
        int m = x.nextInt();
        System.out.println("The difference of sums is: " + differenceOfSums(n, m));
    }
    public static int differenceOfSums(int n, int m) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        return sum;
    }
}
