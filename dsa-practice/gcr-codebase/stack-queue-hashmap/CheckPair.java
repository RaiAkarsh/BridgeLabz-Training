import java.util.*;

public class CheckPair {
    static boolean hasPair(int[] arr, int target) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : arr) {
            int required = target - num;
            if (map.containsKey(required)) {
                System.out.println("Pair found: " + required + ", " + num);
                return true;
            }
            map.put(num, true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }
    }
}
