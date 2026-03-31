import java.util.*;
import java.util.stream.*;

class Student {
    private String name;
    private String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    String getName() { 
        return name; 
    }
    
    String getGrade() { 
        return grade; 
    }
}

public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Akarsh", "A"));
        students.add(new Student("Arsh", "B"));
        students.add(new Student("Shikar", "A"));
        students.add(new Student("Ankit", "C"));

        Map<String, List<String>> result =
        students.stream()
        .collect(Collectors.groupingBy(
            Student::getGrade,
            Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(result);
    }
}
