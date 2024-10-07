// // Abstract class Figure
// abstract class Figure {
//     double dim1;
//     double dim2;

//     // Constructor to initialize dimensions
//     Figure(double a, double b) {
//         dim1 = a;
//         dim2 = b;
//     }

//     // Abstract method area
//     abstract double area();
// }

// // Class Rectangle extends Figure
// class Rectangle extends Figure {
//     // Constructor
//     Rectangle(double a, double b) {
//         super(a, b);
//     }

//     // Override area method for Rectangle
//     double area() {
//         System.out.println("Inside Area for Rectangle.");
//         return dim1 * dim2;
//     }
// }

// // Class Triangle extends Figure
// class Triangle extends Figure {
//     // Constructor
//     Triangle(double a, double b) {
//         super(a, b);
//     }

//     // Override area method for Triangle
//     double area() {
//         System.out.println("Inside Area for Triangle.");
//         return dim1 * dim2 / 2;
//     }
// }

// // Main class to test the abstract class and its derived classes
// class AbstractAreas {
//     public static void main(String args[]) {
//         // Figure f = new Figure(10, 10); // Illegal now, cannot instantiate an abstract class

//         Rectangle r = new Rectangle(9, 5);
//         Triangle t = new Triangle(10, 8);

//         Figure figref; // OK to create a reference of type Figure

//         figref = r;
//         System.out.println("Area is " + figref.area());

//         figref = t;
//         System.out.println("Area is " + figref.area());
//     }
// }


interface Bank 
{
    float rateOfInterest();
}
class SBI implements Bank {
    public float rateOfInterest() {return 9.15f;}
}
class PNB implements Bank {
    public float rateOfInterest() {return 9.7f;}
}
class AbstractAreas
{
    public static void main(String[] args)
    {
        Bank b=new SBI();
        System.out.println("ROI :" + b.rateOfInterest());
    }
}