package org.example;

public class StringUtils {

    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
