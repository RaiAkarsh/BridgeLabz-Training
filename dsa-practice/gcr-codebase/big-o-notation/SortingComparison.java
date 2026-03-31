import java.util.*;

public class SortingComparison {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);

        int[] temp = new int[r - l + 1];
        int i = l, j = m+1, k = 0;

        while (i <= m && j <= r)
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        for (i = l, k = 0; i <= r; i++, k++)
            arr[i] = temp[k];
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int pivot = arr[r], i = l;
        for (int j = l; j < r; j++)
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        quickSort(arr, l, i-1);
        quickSort(arr, i+1, r);
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 7, 1, 6, 2};

        int[] a = new int[nums.length];
        System.arraycopy(nums, 0, a, 0, nums.length);
        bubbleSort(a);
        System.out.println("Bubble Sort: " + Arrays.toString(a));

        int[] b = new int[nums.length];
        System.arraycopy(nums, 0, b, 0, nums.length);
        mergeSort(b, 0, b.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(b));

        int[] c = new int[nums.length];
        System.arraycopy(nums, 0, c, 0, nums.length);
        quickSort(c, 0, c.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(c));
    }
}
