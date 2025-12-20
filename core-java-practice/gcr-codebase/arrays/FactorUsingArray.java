import java.util.*;
public class FactorUsingArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        int maxFactors =10;
        int factors[] = new int[maxFactors];
        int count = 0;
        int i =1;
        while(i<number){
            if(number % i == 0){
                factors[count] = i;
                count++;
            }
            i++;
            if(count == maxFactors){
                int temp[] = new int[maxFactors];
                for(int j=0;j<maxFactors;j++){
                    temp[j] = factors[j];
                }
                maxFactors = maxFactors *2;

                factors = new int[maxFactors];
                
                for(int j=0;j<temp.length;j++){
                    factors[j] = temp[j];
            }
        }
    }
        for(int k=0;k<count;k++){
            System.out.println(factors[k]);
        }
    }
    
}
