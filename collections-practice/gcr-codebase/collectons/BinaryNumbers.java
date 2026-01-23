import java.util.*;
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            String s = q.remove();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
