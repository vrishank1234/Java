public class Rectangle {
    private double length = 1.0;
    private double breadth = 1.0;

    // Default constructor
    public Rectangle() {
    }

    // Constructor with length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to get length
    public double getLength() {
        return length;
    }

    // Method to get breadth
    public double getBreadth() {
        return breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Default Rectangle Length: " + r1.getLength() + ", Breadth: " + r1.getBreadth());
        System.out.println("Area: " + r1.calculateArea());

        Rectangle r2 = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle with Length 5 and Breadth 3: " + r2.getLength() + ", Breadth: " + r2.getBreadth());
        System.out.println("Area: " + r2.calculateArea());
    }
}
