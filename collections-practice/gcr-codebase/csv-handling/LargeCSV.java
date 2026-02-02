import java.io.*;
public class LargeCSV{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("large.csv"));
        int c=0;
        while(br.readLine()!=null){
            c++;
            if(c%100==0){
                System.out.println(c);
            }
        }
        br.close();
    }
}