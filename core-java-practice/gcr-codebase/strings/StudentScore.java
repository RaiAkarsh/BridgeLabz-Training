public class StudentScore {
    public static int[][] score(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 101) ; 
            scores[i][1] = (int)(Math.random() * 101); 
            scores[i][2] = (int)(Math.random() * 101); 
        }
        return scores;
    }

    public static double[][] cal(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }
    public static String[] stugrade(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double p = result[i][2];

            if (p >= 80) {
                grade[i] = "A";
            } 
            else if (p >= 70) {
                grade[i] = "B";
            }
             else if (p >= 60) {
                grade[i] = "C";
            }
             else if (p >= 50) {
                grade[i] = "D";
            }
             else if (p >= 40) {
                grade[i] = "E";
            }
             else {
                grade[i] = "R";
            }
        }
        return grade;
    }

    public static void display(int[][] scores, double[][] result, String[] grade) {

        System.out.println("ID Phy  Chem  Math   Total   Avg %   Grade");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                
                (i + 1) + "\t" +scores[i][0] + "\t" +scores[i][1] + "\t" +scores[i][2] + "\t" +(int)result[i][0] + "\t" +result[i][1] + "\t" + result[i][2] + "\t" + grade[i]);
        }
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] scores = score(students);

        double[][] result = cal(scores);

        String[] grade = stugrade(result);

        display(scores, result, grade);
    }
}


