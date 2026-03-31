import java.util.*;
public class DiscountedFeeInput {
     public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        int fee=x.nextInt();
        int discountPercent=x.nextInt();
        int discount=fee*discountPercent/100;
        System.out.print("The discount amount is INR " + discount+ " and final discounted fee is INR "+(fee-discount));
    }
}
