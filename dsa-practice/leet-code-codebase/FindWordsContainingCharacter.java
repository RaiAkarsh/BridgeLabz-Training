import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "fig", "grape"};
        char x = 'a';
        List<Integer> result = findWordsContaining(words, x);
        System.out.println(result);    
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>map=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                map.add(i);
            }
        }
        return map;
    }
}