import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter weight and height for 10 people");
        double weight[] = new double[10];
        double height[] = new double[10];
        BMICalculator b = new BMICalculator();
        for(int i=0;i<10;i++){
            weight[i] = x.nextDouble();
            height[i] = x.nextDouble();
            double bmi = b.BMI(weight[i],height[i]);
            String category = b.Category(bmi);
            System.out.println("Person " + (i+1) );
            System.out.println("weight " + weight[i] + " kg, height " + height[i] + " m");
            System.out.println("BMI " + bmi + ", Category " + category);
        }
    }
    double BMI(double weight, double height) {
        double h= (height/100);
        return weight / (h * h);
    }
    String Category(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 40) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}