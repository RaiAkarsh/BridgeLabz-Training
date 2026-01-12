import java.util.*;

class EventManagerFunc {

    static int partition(List<Integer> a, int l, int h) {
        int p = a.get(h), i = l - 1;
        for (int j = l; j < h; j++) {
            if (a.get(j) < p) {
                i++;
                int t = a.get(i);
                a.set(i, a.get(j));
                a.set(j, t);
            }
        }
        int t = a.get(i + 1);
        a.set(i + 1, a.get(h));
        a.set(h, t);
        return i + 1;
    }

    static void quickSort(List<Integer> a, int l, int h) {
        if (l < h) {
            int pi = partition(a, l, h);
            quickSort(a, l, pi - 1);
            quickSort(a, pi + 1, h);
        }
    }
}
