import java.util.Scanner;

public class CharacterFrequency { 
     public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = x.nextLine();
        String result[][] = frequency(text);
        System.out.println("Character Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }

    }
    public static char[] uniquechar(String text) {
        int len =text.length();
        char temp[]= new char[len];
        int count =0;
        for (int i=0; i < len; i++) {
            char ch=text.charAt(i);
            boolean isUnique=true;
            for (int j = 0; j < i; j++) {
                if (ch==text.charAt(j)) {
                    isUnique=false;
                    break;
                }
            }
            if (isUnique) {
                temp[count++]=ch;
            }
        }
        char unique[]=new char[count];
        for (int i=0; i < count; i++) {
            unique[i]=temp[i];
        }
        return unique;
    }
    public static String[][] frequency(String text) {
        int freq[]=new int[256]; 
        for (int i=0; i < text.length(); i++) {
            char ch=text.charAt(i);
            freq[ch]++;
        }
        char unique[]=uniquechar(text);
        String result[][] = new String[unique.length][2];

        for (int i=0; i < unique.length; i++) {
            result[i][0]= String.valueOf(unique[i]);
            result[i][1]= String.valueOf(freq[unique[i]]);
        }

        return result;
    }
}
