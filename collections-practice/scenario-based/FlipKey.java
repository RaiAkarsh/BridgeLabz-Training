import java.util.*;
public class FlipKey {
    public static String CleanseAndInvert(String s){
        if(s==null || s.length()<6){
            return "";
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))){
                return "";
            }
        }
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((int)ch%2!=0){
                sb.append(ch);
            }
        }
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(i%2==0){
                char ch=Character.toUpperCase(sb.charAt(i));
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the word");
        String input=x.nextLine();
        String result=CleanseAndInvert(input);
        if(result.equals("")){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("The generated key is - "+result);
        }
    }

}

