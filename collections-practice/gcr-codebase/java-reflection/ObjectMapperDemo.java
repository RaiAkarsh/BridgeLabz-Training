import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class User {
    String name;
    int age;
}

class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (String key : properties.keySet()) {
            Field field = clazz.getDeclaredField(key);
            field.setAccessible(true);
            field.set(obj, properties.get(key));
        }
        return obj;
    }
}

public class ObjectMapperDemo {
    public static void main(String[] args) throws Exception {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Akarsh");
        data.put("age", 21);

        User user = ObjectMapper.toObject(User.class, data);

        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
    }
}
