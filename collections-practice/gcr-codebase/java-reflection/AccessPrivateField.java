import java.lang.reflect.Field;

class Person{
    private int age = 30;
}
public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> cls = person.getClass();
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true); // Bypass the private access modifier
        System.out.println("Before modification  " + field.get(person));
        field.set(person, 40); // Modify the private field
        System.out.println("After modification  " + field.get(person));
    }
}
