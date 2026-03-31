import java.util.*;
public class LongestConsecutiveUsingHashMap {
    static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, false);
        }
        int maxLength = 0;
        for (int num : nums) {
            if (map.get(num)) {
                continue; 
            }
            int currentLength = 1;
            map.put(num, true);
            int left = num - 1;
            while (map.containsKey(left) && !map.get(left)) {
                map.put(left, true);
                currentLength++;
                left--;
            }
            int right = num + 1;
            while (map.containsKey(right) && !map.get(right)) {
                map.put(right, true);
                currentLength++;
                right++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " +longestConsecutive(arr));
    }
}
