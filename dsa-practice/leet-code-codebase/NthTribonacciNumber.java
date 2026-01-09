import java.util.Scanner;
class NthTribonacciNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = x.nextInt();
        System.out.println("tribonacci is "+tribonacci(n));
    }
        public static int tribonacci(int n) {
        if(n<2){
            return n;
        }
        if(n==2){
            return 1;
        }
        int a=0,b=1,c=1,d=0;
        int count=2;
        while(count<n){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            count++;
        }
        return d;
    }
}
