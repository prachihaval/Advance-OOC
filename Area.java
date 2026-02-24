import java.util.Scanner;

// Define the Area class
class Area {
    private int length;
    private int breadth;

    // Method to set the dimensions of the rectangle
    public void setDim(int len, int bre) {
        length = len;
        breadth = bre;
    }

    // Method to calculate and return the area of the rectangle
    public int getArea() {
        return length * breadth;
    }
}

// Main class to run the program and handle user input
public class RectangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        // Read the length entered by the user
        int userLength = scanner.nextInt();

        System.out.println("Enter the breadth of the rectangle:");
        // Read the breadth entered by the user
        int userBreadth = scanner.nextInt();

        // Create an object of the Area class
        Area rectangle = new Area();

        // Call the setDim method to set the dimensions
        rectangle.setDim(userLength, userBreadth);

        // Call the getArea method and store the result
        int area = rectangle.getArea();

        // Print the calculated area
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}