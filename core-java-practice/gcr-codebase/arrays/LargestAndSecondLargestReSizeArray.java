import java.util.Scanner;

public class LargestAndSecondLargestReSizeArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int index = 0;
        int maxDigit = 10;
        int digits[] = new int[maxDigit];
        int largest, secondLargest;
        long number=x.nextLong();

         while (number > 0) {

            if (index == maxDigit) {
               
                int[] temp = new int[maxDigit];
                 maxDigit = maxDigit + 10;

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = new int[maxDigit];
                for (int i = 0; i < temp.length; i++) {
                    digits[i] = temp[i];
                }
            }

            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
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
