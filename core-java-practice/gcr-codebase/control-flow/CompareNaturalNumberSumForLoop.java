import java.util.*;
public class CompareNaturalNumberSumForLoop {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int number=x.nextInt();
        if(number<0){
            System.out.println("Enter a natural number");
            return;
        }
        int sum=number*(number+1)/2;
        int sumbyloop=0;
        for(int i=1;i<=number;i++){
            sumbyloop+=i;
        }
        if(sum==sumbyloop){
            System.out.println("Both sums are equal");
        } else {
            System.out.println("Both sums are not equal");
        }
    }
    
}
