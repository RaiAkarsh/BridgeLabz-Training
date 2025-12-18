import java.util.*;

class Simpleinterest{
  public static void main(String []args){
    Scanner x=new Scanner(System.in);
    int p=x.nextInt();
    int r=x.nextInt();
    double t=x.nextInt();
    double si= (p*r*t)/100;
    System.out.print(si);
  }
}