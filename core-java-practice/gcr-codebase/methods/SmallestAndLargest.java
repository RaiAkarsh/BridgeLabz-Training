import java.util.*;
public class SmallestAndLargest {
      public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the  3 number");
        int num1 =x.nextInt();
        int num2 =x.nextInt();
        int num3 =x.nextInt();
        SmallestAndLargest n =  new SmallestAndLargest();
        int ans[] = n.check(num1, num2, num3);
        System.out.println("Smallest " + ans[0] + ", Largest " + ans[1]);
    }
    int[] check(int num1, int num2, int num3){
        int result[] =new int[2];
        if(num1<=num2 && num1<=num3){
            result[0]= num1;
        }
        else if(num2<=num1 && num2<=num3){
            result[0]= num2;
        }
        else{
            result[0] =num3;
        }
        if(num1>=num2 && num1>=num3){
            result[1]= num1;
        }
        else if(num2>=num1 && num2>=num3){
            result[1] =num2;
        }
        else{
            result[1]= num3;
        }
        return result;
    }
}
