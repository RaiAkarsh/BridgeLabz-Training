import java.util.Scanner;
public class CheckTwoStrings{
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = x.next();
        System.out.println("Enter second string:");
        String str2 = x.next();
        boolean areEqual = false;
        if(str1.length()==str2.length()){
            areEqual = true;
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    areEqual = false;
                    break;
                }
            }
            System.out.println(" by using charAt() the result is "+areEqual);
            if(areEqual==str1.equals(str2)){
                System.out.println("Both methods give the same result ");
            }
            else{
                System.out.println("Both methods give different results");
            }
        }
    }
}