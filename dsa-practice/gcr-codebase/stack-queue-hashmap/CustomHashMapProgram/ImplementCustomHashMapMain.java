public class ImplementCustomHashMapMain {
    public static void main(String[] args) {
        ImplementCustomHashMapFunc<Integer, String> map = new ImplementCustomHashMapFunc<>();
        map.put(101, "Maths");
        map.put(102, "Physics");
        map.put(103, "Chemistry");
        System.out.println("101 : " + map.get(101));
        System.out.println("102 : " + map.get(102));
        System.out.println("103 : " + map.get(103));
        map.put(101, "Advanced Maths");
        System.out.println("Updated 101 : " + map.get(101));
        System.out.println("Removed 102 : " + map.remove(102));
        System.out.println("102 after removal : " + map.get(102));
    }
}
