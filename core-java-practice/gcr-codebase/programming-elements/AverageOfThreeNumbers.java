import java.util.*;

class AverageOfThreeNumbers{
  public static void main(String []args){
    Scanner x=new Scanner(System.in);
    int a=x.nextInt();
    int b=x.nextInt(); 
    int c=x.nextInt();
    int avg=(a+b+c)/3;
    System.out.print(avg);
  }
}