import java.util.*;
public class Quadritic {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b and c");
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        Quadritic q = new Quadritic();
        String  roots = q.calculate(a,b,c);
        System.out.println(roots);
    }
    String calculate(int a,int b,int c){
        double d = b*b - 4*a*c;
        if(d>0){
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            return " positive roots " + r1 + " and " + r2;
        } else if(d==0){
            double r = -b / (2*a);
            return "equal root " + r;
        } else {
            return " no roots";
        }

    }
    
}
