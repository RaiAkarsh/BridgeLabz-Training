import java.util.*;
public class Factor {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num<=0){
            System.out.print("Input should be a positive integer");
            return;
        }
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    
}
