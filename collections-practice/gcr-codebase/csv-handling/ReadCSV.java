import java.io.*;
public class ReadCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new FileReader("students.csv"));
        String line;br.readLine();
        while((line=br.readLine())!=null){
            String[] d=line.split(",");
            System.out.println(d[0]+" "+d[1]+" "+d[2]+" "+d[3]);
        }
        br.close();
    }
}