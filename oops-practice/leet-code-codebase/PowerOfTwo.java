import java.util.*;
class PowerOfTwo{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = x.nextInt();
        if(isPowerOfTwo(n)){
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is not a power of two.");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}