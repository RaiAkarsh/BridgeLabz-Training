public class Volumeofearth {
    public static void main(String[] args) {
        double radiuskm = 6378.0;
        double radiusmiles = radiuskm / 1.6;
        double volume = (4.0 / 3.0) * 3.14 * Math.pow(radiuskm, 3);
        double volumeMiles = (4.0 / 3.0) * 3.14 * Math.pow(radiusmiles, 3);
        System.out.print("The volume of earth in cubic kilometers is " + volume + " and  cubic miles is " + volumeMiles);
    }
    
}
