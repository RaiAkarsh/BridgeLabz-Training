import java.util.*;
class student {
    String name;
    int score;

    student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
}
public class EduResultsFunc {
    // Merges two sorted lists of students into a single sorted list
    public static List<student> merge(List<student> list1, List<student> list2) {
        List<student> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).score >= list2.get(j).score) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }

    // Merges multiple sorted lists of students into a single sorted list
    public static List<student> mergeKLists(List<List<student>> lists) {
        if (lists == null || lists.isEmpty()) return new ArrayList<>();

        while (lists.size() > 1) {
            List<List<student>> mergedLists = new ArrayList<>();

            for (int i = 0; i < lists.size(); i += 2) {
                if (i + 1 < lists.size()) {
                    mergedLists.add(merge(lists.get(i), lists.get(i + 1)));
                } else {
                    mergedLists.add(lists.get(i));
                }
            }

            lists = mergedLists;
        }

        return lists.get(0);
    }
}
