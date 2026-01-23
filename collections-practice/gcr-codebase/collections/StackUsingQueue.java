import java.util.*;
public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x) {
        q1.add(x);
    }
    int pop() {
        while (q1.size() > 1)
            q2.add(q1.remove());
        int x = q1.remove();
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
        return x;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        StackUsingQueue s = new StackUsingQueue();
        System.out.println("Enter number of elements:");
        int n = x.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            s.push(x.nextInt());
        System.out.println("Popped Element:");
        System.out.println(s.pop());
    }
}
