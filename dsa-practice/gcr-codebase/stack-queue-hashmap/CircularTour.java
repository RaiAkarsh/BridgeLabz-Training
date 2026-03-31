import java.util.*;

public class CircularTour {

    static int findStart(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> q = new LinkedList<>();

        int balance = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            balance += petrol[i] - distance[i];
            q.add(i);

            while (balance < 0 && !q.isEmpty()) {
                int removed = q.poll();
                balance -= petrol[removed] - distance[removed];
                start = i + 1;
            }
        }
        if(balance >= 0){
            return start;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        System.out.println("Starting Index: " + findStart(petrol, distance));
    }
}
