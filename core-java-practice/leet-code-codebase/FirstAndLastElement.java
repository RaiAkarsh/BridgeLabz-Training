import java.util.Scanner;

class FirstAndLastElement {
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

        int[] ans = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == t) {
                ans[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == t) {
                ans[1] = i;
                break;
            }
        }

        // Output
        System.out.println(ans[0]+" "+ ans[1]);

        
    }
}
