import java.lang.reflect.Constructor;

class Studentt {
    private String name;
    private int age;

    // constructor with parameters
    public Studentt(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student Created");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DynamicObject {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Studentt.class;
        Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
        Object obj = constructor.newInstance("Akarsh", 21);
    }
}
