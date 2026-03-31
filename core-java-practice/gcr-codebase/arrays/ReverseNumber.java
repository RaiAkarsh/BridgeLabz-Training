import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        int n=number;
        int count=0;
        while (n>0) {{
            n = n / 10;
            count++;
        }
            
        }
        int reverse[] = new int[count];
        while(number>0){
            for(int i=0;number>0;i++){
                reverse[i] = number % 10;
                number = number / 10;
                System.out.print(reverse[i]);
            }
        }
    }
    
}
