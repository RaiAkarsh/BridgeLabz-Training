import java.util.*;
public class MultiplicationTableFor6To9 {
       public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int number = x.nextInt();
        if(number<6 || number>9){
            System.out.println("Number out of range");
            return;
        }
        int table[]= new int[10];
        
        for(int i=0;i<10;i++){
            table[i]=number*(i+1);
            System.out.println(number+" x "+ (i+1)+" = "+ table[i]);
        }
    }
    
}
