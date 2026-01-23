import java.util.*;

public class RotateAList {

    public static <T> void rotateList(List<T> list, int k) {
        int size = list.size();
        k = k % size;

        List<T> temp = new ArrayList<>();

        for (int i = k; i < size; i++)
            temp.add(list.get(i));

        for (int i = 0; i < k; i++)
            temp.add(list.get(i));

        for (int i = 0; i < size; i++)
            list.set(i, temp.get(i));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotateList(list, 2);

        System.out.println(list);
    }
}
