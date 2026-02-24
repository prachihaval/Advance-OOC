import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Enter elements of the first 2x2 matrix:");
        readMatrix(scanner, matrix1);

        System.out.println("Enter elements of the second 2x2 matrix:");
        readMatrix(scanner, matrix2);

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose (of first matrix)");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMatrices(matrix1, matrix2);
                    break;
                case 2:
                    multiplyMatrices(matrix1, matrix2);
                    break;
                case 3:
                    transposeMatrix(matrix1);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Helper function to read matrix elements from user input
    public static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to add two 2x2 matrices
    public static void addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Result of Addition:");
        printMatrix(result);
    }

    // Function to multiply two 2x2 matrices
    public static void multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Result of Multiplication:");
        printMatrix(result);
    }

    // Function to transpose a 2x2 matrix
    public static void transposeMatrix(int[][] matrix) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        System.out.println("Result of Transpose:");
        printMatrix(result);
    }

    // Helper function to print a 2x2 matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}