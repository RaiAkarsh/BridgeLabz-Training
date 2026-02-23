// take name , id and salary in hashmap and sort the hashmap according to salary and then print the 2 and 3 highest salary
// use stream api to sort the hashmap according to salary and then print the 2 and 3 highest salary
import java.util.*;
public class SecondAndThirdSalary{
    public static void main(String[] args){
        HashMap<String,Employee> map=new HashMap<>();
        map.put("Akarsh",new Employee(011, 5000));
        map.put("kanhiya",new Employee(12, 10000));
        map.put("ankit",new Employee(15, 4000));
        map.put("arsh",new Employee(56, 3000));
        // using stream
        map.entrySet().stream()
        .sorted((e1,e2)->Double.compare(e2.getValue().getSalary(),e1.getValue().getSalary())).skip(1).limit(2)
        .forEach(e->System.out.println(e.getKey()+" "+e.getValue().getSalary()));
     
        //using oops concept
        Employee.sortSalary(map);

    }

}