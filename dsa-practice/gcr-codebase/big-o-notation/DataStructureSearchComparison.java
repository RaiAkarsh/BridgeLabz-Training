import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int n = 1000000;
        int target = n - 1;

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        for (int x : arr) if (x == target) break;
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start)/1e6 + " ms");

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start)/1e6 + " ms");

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start)/1e6 + " ms");
    }
}
