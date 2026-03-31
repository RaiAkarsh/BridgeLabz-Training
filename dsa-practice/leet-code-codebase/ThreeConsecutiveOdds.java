import java.util.*;
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = x.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    System.out.println(true);
                    return;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println(false);
    }
}
