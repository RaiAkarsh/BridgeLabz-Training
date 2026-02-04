import java.util.*;

public class TransformingNamesForDisplay {
    public static void main(String[] args) {
        List<String> names = List.of("Chetan", "Ankit", "Shikhar", "Akarsh");
        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}