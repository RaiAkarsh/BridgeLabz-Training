import java.util.*;

class AreaOfCircle{
  public static void main(String []args){
    Scanner x=new Scanner(System.in);
    int radius=x.nextInt();
    double area=3.14 * radius *radius;
    System.out.print(area);
  }
}