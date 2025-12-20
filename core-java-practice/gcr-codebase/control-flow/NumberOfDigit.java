import java.util.*;
public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int number= x.nextInt();
        int count=0;
        if(number==0){
            count=1;
        } else {
            while(number!=0){
                number/=10;
                count++;
            }
        }
        System.out.println("Number of digits " + count);
    }
    
}
