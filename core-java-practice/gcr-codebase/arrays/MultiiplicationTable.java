import java.util.*;
public class MultiiplicationTable {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int number = x.nextInt();
        int table[]= new int[10];
        
        for(int i=0;i<10;i++){
            table[i]=number*(i+1);
            System.out.println(number+" x "+ (i+1)+" = "+ table[i]);
        }
    }
    
}
