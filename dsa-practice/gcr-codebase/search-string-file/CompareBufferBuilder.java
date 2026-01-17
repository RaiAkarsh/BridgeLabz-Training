public class CompareBufferBuilder {
    public static void main(String[] args) {
        int n = 1_000_000;
        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;
        StringBuilder builder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        System.out.println("StringBuffer Time: " + timeBuffer + " ns");
        System.out.println("StringBuilder Time: " + timeBuilder + " ns");
    }
}
