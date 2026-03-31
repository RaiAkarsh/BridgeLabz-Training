import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the  number ");
        int number = x.nextInt();
        Factors f = new Factors();
        int factor[] = f.count(number);
        int cal [] = f.sumsquareproduct(factor);
        System.out.println("Sum of factors is " + cal[0]);
        System.out.println("Sum of square of factors is " + cal[1]);
        System.out.println("Product of factors is " + cal[2]);
    }
    int[] count(int num){
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                ll.add(i);
            }
        }
        int[] factor = new int[ll.size()];
        for(int i=0; i<ll.size(); i++){
            factor[i] = ll.get(i);
        }
        return factor;
    }
    int[] sumsquareproduct(int[] factor){
        int sum = 0;
        int sumSquare = 0;
        int product = 1;
        for(int i=0; i<factor.length; i++){
            sum += factor[i];
            sumSquare += factor[i] * factor[i];
            product *= factor[i];
        }
        return new int[]{sum, sumSquare, product};
    }

    
}
