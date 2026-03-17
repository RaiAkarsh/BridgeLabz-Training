import java.util.*;
import java.util.regex.*;
public class KeyGeneration {
    public static void GenerateKey(String key){
        key=key.trim();
        if(key.length()==0){
            System.out.println("Invalid Input (empty string)");
            return;
        }
        else if(key.length()<6){
                System.out.println("Invalid Input (length < 6)");
                return;
            }
        else if(key.contains(" ")){
                System.out.println("Invalid Input (contains space)");
                return;
        }
        else if(Pattern.matches(".*\\d.*",key)){
                System.out.println("Invalid Input (contains digits)");
                return;
        }
        else if(!Pattern.matches("[A-Za-z]+",key)){
                System.out.println("Invalid Input (contains special character)");
                return;
        }
        else{
            key=key.toLowerCase();
            StringBuilder temp= new StringBuilder();
            for(char c: key.toCharArray()){
                if(c%2!=0){
                    temp.append(c);
                }
            }
            if(temp.length()==0){
                System.out.println("Invalid Input (empty string)");
                return;
            }
            temp.reverse();
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<temp.length();i++){
                if(i%2==0){
                    ans.append(Character.toUpperCase(temp.charAt(i)));
                }
                else{
                    ans.append(temp.charAt(i));
                }
            }
            System.out.println("The generated key is - " + ans);
            return;
        }
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int n = Integer.parseInt(x.nextLine());
        String key[]= new String[n];
        for(int i=0;i<n;i++){
            key[i]=x.nextLine();
        }
        for(int i=0;i<n;i++){
            GenerateKey(key[i]);
        }
    }
    
}
