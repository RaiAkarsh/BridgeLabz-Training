import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

public class LoggingProxyDemo {
    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        // Create dynamic proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                original.getClass().getClassLoader(),
                new Class[]{Greeting.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        // log method name
                        System.out.println("Calling method: " + method.getName());

                        // execute original method
                        return method.invoke(original, args);
                    }
                }
        );

        // call method via proxy
        proxy.sayHello();
    }
}
