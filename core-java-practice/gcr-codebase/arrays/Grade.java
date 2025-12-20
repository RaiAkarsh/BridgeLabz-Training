import java.util.*;

public class Grade {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = x.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter marks for Student ");

            physics[i] = x.nextDouble();
            chemistry[i] = x.nextDouble();
            maths[i] = x.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks Enter positive values");
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + physics[i]);
            System.out.println("Chemistry : " + chemistry[i]);
            System.out.println("Maths     : " + maths[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade     : " + grade[i]);
        }

    }
}
