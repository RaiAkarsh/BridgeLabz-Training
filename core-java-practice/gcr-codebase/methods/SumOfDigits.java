import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits s = new SumOfDigits();
        int number[]= s.randomNumbers(); 
        double sum[] = s.calculate(number);
        System.out.println("Average is "+ sum[0] + " Max is " + sum[1] + " Min is " + sum[2]);
}
    int[] randomNumbers(){
        int n[]=new int[5];
        for(int i=0;i<5;i++){
            n[i]=(int)(Math.random()*9000)+1000;
        }
        return n;
    }
    double[] calculate(int number[]){
        double sum[]=new double[3];
         sum[0]=0;
         sum[1]=0;
         sum[2]=9999;
        for(int i=0;i<5;i++){
            sum[0]+=number[i];
            sum[1] = Math.max(sum[1], number[i]);
            sum[2] = Math.min(sum[2], number[i]);
        }
        sum[0]=sum[0]/5;
        return sum;
    }
}

