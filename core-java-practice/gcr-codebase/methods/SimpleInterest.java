import java.util.Scanner;
public class SimpleInterest {    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Principal, Rate and Time");
        double principal = x.nextDouble(); 
        double rate = x.nextDouble();         
        double time = x.nextDouble(); 
        SimpleInterest si = new SimpleInterest();        
        double interest = si.calculate(principal, rate, time);
        System.out.println("Simple Interest " + interest);
    }

    double calculate(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    
}
