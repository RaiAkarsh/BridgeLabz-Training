import java.util.*;
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int digits[] = new int[10];
        int largest, secondLargest;
        int number=x.nextInt();

        for(int i=0;i<10;i++){
            digits[i] = number % 10;
            number = number / 10;
        }
        largest = -1;
        secondLargest = -1;  
        for(int i=0;i<10;i++){
            if(digits[i]>largest){
                secondLargest = largest;
                largest = digits[i];
            }
            else if(digits[i]>secondLargest && digits[i]!=largest){
                secondLargest = digits[i];
            }
        }
        System.out.println("The largest digit is "+largest);
        System.out.println("The second largest digit is "+secondLargest);
    }
    
}
