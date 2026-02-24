// Define the abstract class Shape in a file named Shape.java
abstract class Shape {
    protected double dim1;
    protected double dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    // Abstract method for area calculation
    public abstract double area();
}

// Define the Rectangle class in a file named Rectangle.java
class Rectangle extends Shape {
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return this.dim1 * this.dim2;
    }
}

// Define the Triangle class in a file named Triangle.java
class Triangle extends Shape {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        // Area of a triangle is 0.5 * base * height
        return 0.5 * this.dim1 * this.dim2;
    }
}

// Define the main class to run the program in a file named ShapeDemo.java
public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("Java Implementation:");

        // Create instances of Rectangle and Triangle
        // We can declare them as the abstract type Shape
        Shape rect = new Rectangle(10.0, 5.0);
        Shape tri = new Triangle(10.0, 5.0);

        // Calculate and print the areas
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
    }
}