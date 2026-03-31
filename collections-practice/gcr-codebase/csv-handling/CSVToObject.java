import java.io.*;
import java.util.*;
class Student{
    String id,name,age,marks;
}
public class CSVToObject{
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("students.csv"));
        List<Student> list=new ArrayList<>();
        String l;
        br.readLine();
        while((l=br.readLine())!=null){
            String[] d=l.split(",");
            Student s=new Student();
            s.id=d[0];
            s.name=d[1];
            s.age=d[2];
            s.marks=d[3];
            list.add(s);
        }
        list.forEach(s->System.out.println(s.name));
     }
}