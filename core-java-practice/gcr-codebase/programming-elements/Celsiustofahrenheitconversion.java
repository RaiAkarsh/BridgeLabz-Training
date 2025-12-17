import java.util.*;

class Celsiustofahrenheitconversion{
  public static void main(String []args){
    Scanner x=new Scanner(System.in);
    int c=x.nextInt();
    int f=(c* 9/5)+32;
    System.out.print(f);
  }
}