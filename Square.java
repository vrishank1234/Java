public class Square {
    private double side = 1.0;

    // Default constructor
    public Square() {
    }

    // Constructor with side
    public Square(double side) {
        this.side = side;
    }

    // Method to get side
    public double getSide() {
        return side;
    }

    // Method to calculate area
    public double calculateArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println("Default Square Side: " + s1.getSide());
        System.out.println("Area: " + s1.calculateArea());

        Square s2 = new Square(4.0);
        System.out.println("Square with Side 4: " + s2.getSide());
        System.out.println("Area: " + s2.calculateArea());
    }
}
