import java.util.*;
class StockSpanProblem {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;
        int[] spans = calculateSpan(prices, n);
        
        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Stock Spans: " + Arrays.toString(spans));
    }
    static int[] calculateSpan(int[] prices, int n) {
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();
        spans[0] = 1;
        stack.push(0);
        for(int i=1 ;i<n;i++){
            while(!stack.isEmpty() && prices[i]>= prices[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                spans[i]=i+1;
            }
            else{
                spans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return spans;
    }
}
