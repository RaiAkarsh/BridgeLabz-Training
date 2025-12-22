import java.util.Scanner;

public class VowelConsonantCount {

    public static int[] count(String text) {

        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') ch += 32;

            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a String");
        String text = x.nextLine();

        int[] result = count(text);

        System.out.println("Vowels     : " + result[0]);
        System.out.println("Consonants : " + result[1]);
    }
}
