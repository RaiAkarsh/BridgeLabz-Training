public class Dividepen {
    public static void main(String[] args) {
        int pens=14;
        int r=pens%3;
        int left=(pens-r)/3;
        System.out.println("The Pen Per Student is "+left+" and the remaining pen not distributed is "+r);
    }
}
