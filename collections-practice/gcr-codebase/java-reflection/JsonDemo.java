import java.lang.reflect.Field;

class Student {
    String name;
    int marks;
}

class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        StringBuilder json = new StringBuilder("{");

        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"")
                    .append(field.getName())
                    .append("\":\"")
                    .append(field.get(obj))
                    .append("\",");
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");

        return json.toString();
    }
}

public class JsonDemo {
    public static void main(String[] args) throws Exception {

        Student s = new Student();
        s.name = "Rahul";
        s.marks = 85;

        String json = JsonUtil.toJson(s);
        System.out.println(json);
    }
}
