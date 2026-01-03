import java.util.Scanner;
public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        float temps[][] = new float[7][24];
        float dailyAverages[] = new float[7];
        float hottestTemp = 0.0f;
        int hottestDay = -1;
        float coldestTemp = Float.MAX_VALUE;
        int coldestDay = -1;
        float sum=0.0f;
        System.out.println("Enter temperatures for 7 days (24 values each):");
        for(int i=0;i<7;i++){
            System.out.println("Day " + (i+1) + ":");
            for(int j=0;j<24;j++){
                temps[i][j] = x.nextFloat();
                sum += temps[i][j];
                if(temps[i][j] > hottestTemp){
                    hottestTemp = temps[i][j];
                    hottestDay = i+1;
                }
                if(temps[i][j] < coldestTemp){
                    coldestTemp = temps[i][j];
                    coldestDay = i+1;
                }
            }
            dailyAverages[i] = sum / 24;
            sum = 0.0f;
        }
        System.out.println("Daily Averages:");
        for(int i=0;i<7;i++){
            System.out.println("Day " + (i+1) + " : " + dailyAverages[i]);
        }
        System.out.println("Hottest Temperature: " + hottestTemp + " on Day " + hottestDay);
        System.out.println("Coldest Temperature: " + coldestTemp + " on Day " + coldestDay);
    }
}
