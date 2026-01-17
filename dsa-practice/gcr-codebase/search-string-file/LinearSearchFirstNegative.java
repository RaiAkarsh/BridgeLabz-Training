public class LinearSearchFirstNegative {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, -8, 7, -2};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }
        System.out.println("First negative number index: " + index);
    }
}