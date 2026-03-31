import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of entries:");
        int totalEntries = x.nextInt();
        Map<String, Integer> originalMap = new HashMap<>();
        for (int i = 0; i < totalEntries; i++)
            originalMap.put(x.next(), x.nextInt());
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            
            invertedMap.putIfAbsent(entry.getValue(), new ArrayList<>());
            invertedMap.get(entry.getValue()).add(entry.getKey());
        }
        System.out.println(invertedMap);
    }
}