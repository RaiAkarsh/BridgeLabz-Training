import java.util.*;
public class MaxValueKey {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of entries:");
        int totalEntries = x.nextInt();
        Map<String, Integer> dataMap = new HashMap<>();
        for (int i = 0; i < totalEntries; i++)
            dataMap.put(x.next(), x.nextInt());
        String highestKey = null;
        int highestValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : dataMap.entrySet())
            if (entry.getValue() > highestValue) {
                highestValue = entry.getValue();
                highestKey = entry.getKey();
            }
        System.out.println(highestKey);
    }
}