import java.util.*;
public class SortProductPrices {
        public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter no. of products");
        int n = x.nextInt();
        System.out.println("Enter the prices of the products");
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=x.nextInt();
        }
        prices= quickSort(prices,0,n-1);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(prices[i]+"  ");
        }
    }
        public static int[] quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
        return prices;
    }
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }
}
