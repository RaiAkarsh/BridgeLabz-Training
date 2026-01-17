import java.util.Arrays;
public class SearchChallenge {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 2, 6};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                int index = arr[i] - 1;
                if (arr[index] != arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    i--;
                }
            }
        }
        int missing = n + 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                missing = i + 1;
                break;
            }
        }
        System.out.println("First Missing Positive: " + missing);
        Arrays.sort(arr);
        int target = 4;
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target Index after Sorting: " + result);
    }
}