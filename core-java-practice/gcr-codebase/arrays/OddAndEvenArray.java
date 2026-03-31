import java.util.*;
public class OddAndEvenArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        if(number<=0){
            System.out.println("enter natural number ");
            return;
        }
        int even[] = new int[number/2+1];
        int odd[] =new int[number/2+1];
        int evencounter=0;
        int oddcounter=0;

        for(int i=1;i<=number;i++){
            if(i%2==0){
                even[evencounter]=i;
                evencounter++;
            }
            else{
                odd[oddcounter]=i;
                oddcounter++;
            }
        }
        System.out.println("Even Array");
        
        for(int i=0;i<even.length;i++){
            if(even[i]==0){
                break;
            }
            System.out.print(even[i]+" ");
        }
        
        System.out.println();
        System.out.println("Odd Array");

        for(int i=0;i<odd.length;i++){
            if(odd[i]==0){
                break;
            }
            System.out.print(odd[i]+" ");
        }

    }
}
