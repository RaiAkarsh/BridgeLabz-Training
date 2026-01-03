import java.util.Scanner;
class SentenceFormatter{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = x.nextLine();
        formatSentence(str);
    }
    public static void formatSentence(String str){
        if(str == null || str.isEmpty()){
            System.out.println("Empty or null string provided.");
            return;
        }
        str = str.trim().replaceAll("\\s+", " ");
        str = str.replaceAll("([.!?])\\s*", "$1 ");
        StringBuilder s = new StringBuilder();
        boolean capNext = true;
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c = chars[i];
            if(capNext && Character.isLetter(c)){
                s.append(Character.toUpperCase(c));
                capNext = false;
            } 
            else {
                s.append(c);
            }
            if(c == '.' || c == '!' || c == '?'){
                capNext = true;
            }
        }
        System.out.println("Formatted Sentence:");
        System.out.println(s.toString().trim());
  
    }
}