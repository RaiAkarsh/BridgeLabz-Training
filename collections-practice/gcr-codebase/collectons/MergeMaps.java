import java.util.*;
public class MergeMaps {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();
        System.out.println("Enter entries for first map:");
        int firstCount = x.nextInt();
        for (int i = 0; i < firstCount; i++)
            firstMap.put(x.next(), x.nextInt());
        System.out.println("Enter entries for second map:");
        int secondCount = x.nextInt();
        for (int i = 0; i < secondCount; i++)
            secondMap.put(x.next(), x.nextInt());
        for (Map.Entry<String, Integer> entry : secondMap.entrySet())
            firstMap.put(entry.getKey(),firstMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        System.out.println(firstMap);
    }
}