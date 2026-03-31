import java.io.*;
import java.util.*;
public class DetectDuplicates{
    public static void main(String[] args)throws Exception{
        Set<String> s=new HashSet<>();
        BufferedReader br=new BufferedReader(new FileReader("data.csv"));
        br.readLine();
        String l;
        while((l=br.readLine())!=null){
            if(!s.add(l.split(",")[0]))System.out.println(l);
        }
        br.close();
    }
}