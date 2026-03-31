import java.util.*;
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double height[] = new double[11];
        double sumofheight = 0.0;

        for(int i=0;i<11;i++){
            height[i] = x.nextDouble();
            sumofheight+=height[i];
        }
        double mean = sumofheight / 11;
        System.out.println("Mean of the player's height is "+mean);
    }
}
