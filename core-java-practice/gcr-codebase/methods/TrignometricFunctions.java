import java.util.*;
public class TrignometricFunctions {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("enter the angle");
        double angle = x.nextDouble();
        double radian=Math.toRadians(angle);
        TrignometricFunctions t = new  TrignometricFunctions();
        double tri[] = t.calculate(radian);
        System.out.println("Sine " + tri[0] + ", Cosine " + tri[1] + ", Tangent " + tri[2]);
    }
    double[] calculate(double radian){
        double result[] = new double[3];
        result[0]= Math.sin(radian);
        result[1]= Math.cos(radian);
        result[2]= Math.tan(radian);
        return result;
    }
}

