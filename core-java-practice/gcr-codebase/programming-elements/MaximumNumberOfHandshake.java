import java.util.*;
public class MaximumNumberOfHandshake {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int maxHandshakes = n * (n - 1) / 2;
        System.out.print("Maximum number of handshakes possible is" + maxHandshakes);
    }
    
}
