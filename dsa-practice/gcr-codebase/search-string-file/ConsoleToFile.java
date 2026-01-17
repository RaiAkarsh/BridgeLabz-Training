import java.io.*;
public class ConsoleToFile {
    public static void main(String[] args) {
        try {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            FileWriter fw=new FileWriter("output.txt");
            System.out.println("Enter text (type exit to stop):");
            String line;
            while(!(line=br.readLine()).equals("exit")){
                fw.write(line+"\n");
            }
            fw.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}