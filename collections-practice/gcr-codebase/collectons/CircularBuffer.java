import java.util.*;
public class CircularBuffer {
    int[] arr;
    int size, front = 0, count = 0;
    CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
    }
    void insert(int x) {
        int idx = (front + count) % size;
        if (count == size)
            front = (front + 1) % size;
        else
            count++;
        arr[idx] = x;
    }
    void display() {
        for (int i = 0; i < count; i++)
            System.out.print(arr[(front + i) % size] + " ");
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter buffer size:");
        int size = x.nextInt();
        CircularBuffer cb = new CircularBuffer(size);
        System.out.println("Enter elements:");
        for (int i = 0; i < size + 1; i++)
            cb.insert(x.nextInt());
        cb.display();
    }
}
