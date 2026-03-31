import java.util.*;
public class SumOfNaturalNumbers {
      public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the number");
        int num =x.nextInt();
        SumOfNaturalNumbers s =  new SumOfNaturalNumbers();
        int ans = s.sum(num);
        System.out.println(ans);
    }

    int sum(int num){
        int total=0;
        for(int i =1;i<=num;i++){
            total+=num;
        }
        return total;
    }
}
