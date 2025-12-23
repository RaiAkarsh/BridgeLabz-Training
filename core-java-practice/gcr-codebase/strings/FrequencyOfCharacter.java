import java.util.Scanner;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string ");

        String str = x.nextLine();

        boolean[] visited = new boolean[str.length()];

        
        System.out.println("Character Frequency");
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) {
                continue;
            }
            char curr =str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (curr == str.charAt(j)) {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(curr + " : " + count);
        }
    }
}
    

