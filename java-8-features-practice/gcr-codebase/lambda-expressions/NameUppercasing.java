import java.util.*;
public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("akarsh", "ankit", "chetan");
        List<String> uppercasedNames = names.stream().map(String::toUpperCase).toList();
        uppercasedNames.forEach(System.out::println);
    }
    
}
