import java.util.*;
public class OTPGenerator {
    public static void main(String[] args) {
        OTPGenerator og= new OTPGenerator();
        long otp[]= og.generate();
        System.out.println("Generated OTP is");
        for(int i=0;i<otp.length;i++){
            System.out.println(otp[i]);
        }
    }
    long[] generate(){
        long otp[]=new long[10];
        int i=0;
        while(i<10){
            otp[i]=(long)(Math.random()*9000000000L)+1000000000;
            for(int j=0;j<i;j++){
                if(otp[i]==otp[j]){
                    i--;
                    break;
                }
            }
            i++;
        }
        return otp;
    }
    
}
