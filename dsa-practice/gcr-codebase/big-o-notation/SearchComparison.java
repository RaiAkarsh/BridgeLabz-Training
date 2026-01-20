import java.util.*;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {12, 5, 8, 20, 1, 15};
        int target = 15;
        System.out.println("Linear Search index: " + linearSearch(data, target));
        System.out.println("Binary Search index: " + binarySearch(data, target));
    }
}
