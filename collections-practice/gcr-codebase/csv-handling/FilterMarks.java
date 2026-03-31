import java.io.*;
public class FilterMarks{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("students.csv"));
        String l;
        br.readLine();
        while((l=br.readLine())!=null){
            String[] d=l.split(",");
            if(Integer.parseInt(d[3])>80)System.out.println(d[1]);
        }
        br.close();
    }
}