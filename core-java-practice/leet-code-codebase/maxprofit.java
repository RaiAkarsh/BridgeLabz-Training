import java.util.Scanner;

class maxprofit {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Input array size and prices
        int n = x.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = x.nextInt();
        }

  
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
        }

        // Output
        System.out.println("Maximum Profit: " + maxProfit);

        
    }
}
