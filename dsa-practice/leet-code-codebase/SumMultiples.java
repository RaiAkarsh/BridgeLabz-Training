import java.util.*;
public class SumMultiples {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = x.nextInt();
        SumMultiples sm = new SumMultiples();
        System.out.println(sm.sumOfMultiples(n));
    }
    

    public int sumOfMultiples(int n) {
        int sum=0;
        while(n>0){
            if(n%3==0 || n%5==0 || n%7==0){
                sum+=n;
            }
            n--;
        }
        return sum;
    }
}