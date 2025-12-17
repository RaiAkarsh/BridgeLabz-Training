import java.util.*;

class kmtomiles{
  public static void main(String []args){
    Scanner x=new Scanner(System.in);
    int km=x.nextInt();//kilometers
    double miles= km*0.621371;//kilometers to miles
    System.out.print(miles);
  }
}