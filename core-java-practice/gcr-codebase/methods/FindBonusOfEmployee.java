public class FindBonusOfEmployee {
    public static void main(String[] args) {
        double[][] employee = generate();
        System.out.println("Emp  Salary  Years of Service");
        for (int i = 0; i <10; i++) {
            System.out.println((i + 1) + "\t" + (int) employee[i][0] + "\t\t" + (int) employee[i][1]);
        }
    }
    public static double[][] generate() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000)+10000;
            data[i][1] = (int) (Math.random() * 11);
        }
        return data;
    }
}
