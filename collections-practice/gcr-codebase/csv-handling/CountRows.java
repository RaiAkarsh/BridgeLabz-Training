import java.io.*;
public class CountRows{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("employees.csv"));
        int c=0;
        br.readLine();
        while(br.readLine()!=null)c++;
        br.close();
        System.out.println(c);
    }
}