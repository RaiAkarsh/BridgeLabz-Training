import java.util.*;
class FirstPalindromicString {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int n = x.nextInt();
        System.out.println("Enter the words: ");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = x.next();
        }
        System.out.println("First Palindrome is " + firstPalindrome(words));
    }
    public static boolean isTrue(String str){
        int n = str.length();
        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false; 
            }
        }
        return true; 
    }
    public static String firstPalindrome(String[] words) {
        for(String s : words){
            if(isTrue(s)){ 
                return s;  
            }
        }
        return ""; 
    }
}