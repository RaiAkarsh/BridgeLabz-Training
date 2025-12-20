import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number of people");
        int numberofpeople = x.nextInt();
        double weight [] = new double[numberofpeople];
        double height [] = new double[numberofpeople];
        double bmi [] = new double[numberofpeople];
        String weightstatus[] = new String[numberofpeople];

        for(int i=0; i<numberofpeople; i++){
            System.out.println("Enter weight and height  ");
            weight[i] = x.nextDouble();
            height[i] = x.nextDouble();
            bmi[i] = weight[i]/(height[i]*height[i]);
            if(bmi[i]<18.5){
                weightstatus[i] = "Underweight";
            }
            else if(bmi[i]>=18.5 && bmi[i]<24.9){
                weightstatus[i] = "Normal weight";
            }
            else if(bmi[i]>=25 && bmi[i]<29.9){
                weightstatus[i] = "Overweight";
            }
            else{
                weightstatus[i] = "Obesity";
            }

        }
        for(int i=0; i<numberofpeople; i++){
                System.out.println("Person "+(i+1)+"  ");
                System.out.print("height "+height[i]+"  ");
                System.out.print("weight "+weight[i]+"  ");
                System.out.print("BMI "+bmi[i]+"  ");
                System.out.println("Weight Status is "+weightstatus[i]);
        }
    }
    
}
