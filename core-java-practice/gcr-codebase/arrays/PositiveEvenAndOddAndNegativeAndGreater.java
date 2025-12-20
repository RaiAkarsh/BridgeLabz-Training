import java.util.*;
public class PositiveEvenAndOddAndNegativeAndGreater {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int number[] = new int[5];
        
        for(int i=0; i<5;i++){
            number[i] = x.nextInt();
            if(number[i]>0){
                System.out.println("positive number");
                if(number[i]%2==0){
                    System.out.println("even number");
                }
                else{
                    System.out.println("odd number");
                }
            }
            else if(number[i]<0){
                System.out.println("negative number");
            }
            else{
                System.out.println("zero");
            }
        }
        if(number[0]==number[4]){
            System.out.println("equal");
        }
        else if(number[0]<number[4]){
            System.out.println("less");
        }
        else{
            System.out.println("greater");
        }
    }
    
}
