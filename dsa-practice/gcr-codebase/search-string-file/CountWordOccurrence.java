import java.io.*;
import java.util.Scanner;
public class CountWordOccurrence {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter word to search:");
        String word=x.next();
        int count=0;
        try {
            FileReader fr=new FileReader("sample.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                String[] arr=line.split("\\s+");
                for(String w:arr){
                    if(w.equalsIgnoreCase(word)){count++;}
                }
            }
            br.close();
            System.out.println("Count: "+count);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}