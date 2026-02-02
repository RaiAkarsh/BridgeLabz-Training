import java.io.*;
import java.util.*;
public class MergeCSV{
    public static void main(String[] args)throws Exception{
        Map<String,String> m=new HashMap<>();
        BufferedReader b1=new BufferedReader(new FileReader("students1.csv"));
        b1.readLine();
        String l;
        while((l=b1.readLine())!=null){
            m.put(l.split(",")[0],l);
       }
       BufferedReader b2=new BufferedReader(new FileReader("students2.csv"));
       BufferedWriter bw=new BufferedWriter(new FileWriter("merged.csv"));
       bw.write("ID,Name,Age,Marks,Grade\n");
       b2.readLine();
       while((l=b2.readLine())!=null){
            String[] d=l.split(",");
            if(m.containsKey(d[0])){
                bw.write(m.get(d[0])+","+d[1]+","+d[2]+"\n");
            }
       }
       bw.close();
       b1.close();
       b2.close();}
}