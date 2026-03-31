import java.util.Scanner;
public class FindSubstringOcurrence {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainStr =x.nextLine();
        System.out.println("Enter the substring to find:");
        String subStr=x.nextLine();
        int count =0;
        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {
            if (mainStr.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }
        System.out.println("The substring '" + subStr + "' occurs " + count + " times");
    }
    
}
