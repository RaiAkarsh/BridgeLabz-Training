import java.io.*;import java.util.*;
public class SortSalary{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("employees.csv"));
        List<String[]> l=new ArrayList<>();br.readLine();String s;
        while((s=br.readLine())!=null){
            l.add(s.split(","));
        }
        l.sort((a,b)->Integer.parseInt(b[3])-Integer.parseInt(a[3]));
        for(int i=0;i<5;i++)System.out.println(l.get(i)[1]);
        br.close();
    }
}