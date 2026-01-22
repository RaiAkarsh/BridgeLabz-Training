import java.util.*;

public class ReverseAList {

    public static <T> void reverseList(List<T> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        reverseList(ar);
        reverseList(ll);

        System.out.println(ar); 
        System.out.println(ll);  
    }
}
