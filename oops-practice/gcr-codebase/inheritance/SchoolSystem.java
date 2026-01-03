class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person {
    String grade;
    public Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
class Staff extends Person {
    String department;
    public Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Tony", 35, "java"),
            new Student("Akarsh", 16, "10th Grade"),
            new Staff("Steve", 40, "Administration")
        };

        for (Person person : people) {
            person.displayInfo();
            System.out.println();
        }
    }
}