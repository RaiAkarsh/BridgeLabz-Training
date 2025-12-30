class Circle {
    double radius;
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 2.5;

        c.area();
        c.circumference();
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: "+ area);
    }
    void circumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle: "+ circumference);
    }
}
