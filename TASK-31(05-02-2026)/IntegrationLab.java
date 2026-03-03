abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    double area() {
        return 3.14 * radius * radius;
    }
}

public class IntegrationLab {

    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println("Area: " + s.area());
    }
}