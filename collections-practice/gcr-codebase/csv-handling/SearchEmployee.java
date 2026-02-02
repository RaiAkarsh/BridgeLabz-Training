import java.io.*;
public class SearchEmployee{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("employees.csv"));
        String l;br.readLine();
        while((l=br.readLine())!=null){
            String[] d=l.split(",");
            if(d[1].equalsIgnoreCase("Alice"))
                System.out.println(d[2]+" "+d[3]);
        }
        br.close();
    }
}