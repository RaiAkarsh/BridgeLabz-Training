import java.util.*;

class volumeofcylinder{
  public static void main(String []args){
    Scanner x=new Scanner(System.in);
    int radius=x.nextInt();
    int height=x.nextInt();
    double vol=3.14 * radius *radius*height;
    System.out.print(vol);
  }
}