import java.util.*;
public class PerformDoubleOp {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        double a=x.nextInt();
        double b=x.nextInt();
        double c=x.nextInt();
        double op1=a+b*c;
        double op2=a*b+c;
        double op3=c+a/b;
        double op4=a%b+c;
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
       
    }
    
}

    

