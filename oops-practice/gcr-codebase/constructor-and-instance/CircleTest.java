class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
public class CircleTest {
    public static void main(String[] args) {
        // Creating circle objects using both constructors
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);

        // Displaying area of circles
        System.out.println("Area of circle1 (default radius): " + circle1.area());
        System.out.println("Area of circle2 (radius 5.0): " + circle2.area());
    }
}