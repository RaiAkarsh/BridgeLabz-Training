public class ShortestTallestAndMeanHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // for getting random height between 150 and 250
        }
        double [] sum = Sum(heights);
        int [] shorttall = find(heights);
        System.out.println("Sum of heights " + sum[0]);
        System.out.println("Mean height " + sum[1]);
        System.out.println("Shortest height " + shorttall[0]);
        System.out.println("Tallest height " + shorttall[1]);
    }
    public static double[] Sum(int[] heights) {
        double[] sum = new double[2];
        for (int i = 0; i < 11; i++) {
            sum[0] += heights[i];
        }
        sum[1] = sum[0] / 11;
        return sum;
    }
    public static int[] find(int[] heights) {
        int shorttall [] = new int[2];
        shorttall[0] = 999;
        for (int i =0 ;i<11; i++) {
            if (heights[i] < shorttall[0]) {
                shorttall[0] = heights[i];
            }
            if (heights[i] > shorttall[1]) {
                shorttall[1] = heights[i];
            }
        }
        return shorttall;
    }
}
