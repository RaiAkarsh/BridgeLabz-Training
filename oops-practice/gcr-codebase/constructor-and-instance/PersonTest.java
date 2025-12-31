class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " | Age: " + age);
    }
}
public class PersonTest {
    public static void main(String[] args) {
        // Creating a Person object using the parameterized constructor
        Person person1 = new Person("AKarsh", 21);
        
        // Creating a copy of person1 using the copy constructor
        Person person2 = new Person(person1);

        // Displaying details of both persons
        person1.display();
        person2.display();
    }
}