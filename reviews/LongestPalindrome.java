import java.util.*;
public class LongestPalindrome {
	
	public static boolean checkpalindrome(String word) {
		StringBuffer a = new StringBuffer();
		a.append(word);
		String reversed = a.reverse().toString();
		if(word.equalsIgnoreCase(reversed)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = x.next();
		char ar[] = s.toCharArray();
		int max=0;
		String maxword="",word="";
		
		for(int j=0;j<ar.length && ar.length-j>max;j++) {
			StringBuilder sb = new StringBuilder();
			word="";
			for(int i=j;i<ar.length;i++) {
				word=sb.append(ar[i]).toString();
				if(checkpalindrome(word)) {
					if(word.length()>max) {
						max=word.length();
						maxword=word;
					}
				}
			}
		}				
		if(maxword.equals("")) {
			System.out.println("no palindrome present");
		}
		else {
			System.out.println("Longest palindrome is "+ maxword);
		}
	}

}
