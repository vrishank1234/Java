public class Circle {
    private double radius = 1.0;

    // Default constructor
    public Circle() {
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to get radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Default Circle Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Circumference: " + c1.calculateCircumference());

        Circle c2 = new Circle(5.0);
        System.out.println("Circle with Radius 5: " + c2.getRadius());
        System.out.println("Area: " + c2.calculateArea());
        System.out.println("Circumference: " + c2.calculateCircumference());
    }
}
