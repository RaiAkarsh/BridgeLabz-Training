import java.lang.reflect.Method;

// Sample class
class Task {
    public void execute() {
        for (int i = 0; i < 1000000; i++) {
        }
    }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {

        Task task = new Task();
        Class<?> cls = task.getClass();
        Method method = cls.getMethod("execute");
        long startTime = System.nanoTime();
        method.invoke(task);
        long endTime = System.nanoTime();

        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}
