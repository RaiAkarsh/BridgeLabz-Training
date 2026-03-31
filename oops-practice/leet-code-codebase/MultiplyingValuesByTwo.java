import java.util.*;
public class MultiplyingValuesByTwo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size of array and the elements:");
        int size = x.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = x.nextInt();
        }
        System.out.println("Enter the no. to start with:");
        int original = x.nextInt();
        System.out.println("The final value after multiplying by two is: " + findFinalValue(num, original));
    }
        public static int findFinalValue(int[] nums, int original) {
        boolean found = true;
        while(found){
            found =false;
            for(int i : nums){
                 if(i==original){
                    original*=2;
                    found =true;
                }
            }
        }
        return original;
    }
}
