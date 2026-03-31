import java.util.*;
public class SumOfNaturalNumberRecursive {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = x.nextInt();
        SumOfNaturalNumberRecursive s = new SumOfNaturalNumberRecursive();
        int ans1 = s.sum(number);
        int ans2 = number * (number + 1) / 2;
        System.out.println("Sum using recursion and formula are " + ans1+" "+ans2);
    }
    int sum(int num){
        if(num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }
    
}
