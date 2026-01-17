public class BinarySearchRotationPoint {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println("Rotation point index: " + left);
    }
}