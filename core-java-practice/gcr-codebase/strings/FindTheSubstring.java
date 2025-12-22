import java.util.Scanner;
public class FindTheSubstring {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the main string");
        String str = x.next();
        System.out.println("Enter the  index for the substring to find");
        int beginIndex = x.nextInt();
        int endIndex = x.nextInt();
        String substr = str.substring(beginIndex, endIndex+1);
        String result = "";
        for(int i=beginIndex;i<=endIndex;i++){
            result += str.charAt(i);
        }
        if(result.equals(substr)){
            System.out.println("The substring found using charAt() is: " + result);
            System.out.println("Both methods give the same result");
        }
        else{
            System.out.println("The substring found using charAt() is: " + result);
            System.out.println("Both methods give different results");
        }
    }
    
}
