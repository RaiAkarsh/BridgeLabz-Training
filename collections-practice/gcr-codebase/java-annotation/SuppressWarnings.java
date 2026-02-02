import java.util.*;

class SuppressWarningDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("Hello");
        System.out.println(list);
    }
}