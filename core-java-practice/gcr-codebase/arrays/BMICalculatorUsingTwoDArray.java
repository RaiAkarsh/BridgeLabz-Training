import java.util.*;
public class BMICalculatorUsingTwoDArray {    
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter number of people");
        int number = x.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Enter weight and height");
            personData[i][0] = x.nextDouble();
            personData[i][1] = x.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input Enter positive values.");
                i--;
                continue;
            }

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }


        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight " + personData[i][0]);
            System.out.println("Height " + personData[i][1]);
            System.out.println("BMI    " + personData[i][2]);
            System.out.println("Status " + weightStatus[i]);
        }

    }
}

