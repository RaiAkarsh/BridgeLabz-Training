import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        double weight= x.nextDouble();
        double height= x.nextDouble();
        double bmi= weight/(height*height);
        if(bmi<=18.4){
            System.out.println("Underweight");
        } else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        } else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
    
}
