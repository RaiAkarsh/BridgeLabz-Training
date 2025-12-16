import java.util.Scanner;

class rmvele {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Input array size and elements 
        int n = x.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = x.nextInt();
        }
        // Input value to remove
        int val = x.nextInt();
        int in = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[in] = nums[i];
                in++;
            }
        }

        // Output
        for (int i = 0; i < in; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
