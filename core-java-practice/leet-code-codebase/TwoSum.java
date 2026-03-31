import java.util.Scanner;

class TwoSum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Input array size and elements
        int n = x.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = x.nextInt();
        }

        // Input target
        int t = x.nextInt();
        int ar[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == t) {
                    ar[0] = i;
                    ar[1] = j;
                }
            }
        }

        // Output
        System.out.println(ar[0] + " " + ar[1]);
    }
}
