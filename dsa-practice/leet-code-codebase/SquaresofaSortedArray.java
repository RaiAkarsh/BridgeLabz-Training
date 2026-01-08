import java.util.*;
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = x.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=x.nextInt();
        }
        int[] result = sortedSquares(nums);
        System.out.println("The sorted squares of the array are:");
        for(int i : result){
            System.out.print(i + " ");
        }
    }
        public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        
    }
}
