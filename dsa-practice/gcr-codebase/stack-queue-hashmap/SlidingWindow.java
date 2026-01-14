import java.util.*;

public class SlidingWindow{

    static void Max(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }
            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            // Add current index
            dq.offer(i);
            // Print max once first window is complete
            if (i >= k - 1) {
                System.out.print(arr[dq.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        Max(arr, k);
    }
}
