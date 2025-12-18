import java.util.*;
public class PerformOp {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        int op1=a+b*c;
        int op2=a*b+c;
        int op3=c+a/b;
        int op4=a%b+c;
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
       
    }
    
}
