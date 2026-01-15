import java.util.*;
public class MinimumNumberGame {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,4,6};
        System.out.println("Resulting array: " + Arrays.toString(numberGame(nums)));  
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums.length];
        int index=0;
        for(int i=1;i<nums.length;i+=2){
            arr[index++]=nums[i];
            arr[index++]=nums[i-1];
        }
        return arr;
    }
}
