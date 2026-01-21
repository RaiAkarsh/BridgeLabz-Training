public class XOROperationInAnArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int result = xorOperation(n, start);
        System.out.println(result);
    }
    public static int xorOperation(int n, int start) {
        int result = start;

        for(int i = 1; i<n; i++) {
            result ^= (start+2*i);
        }
        return result;
    }
}
