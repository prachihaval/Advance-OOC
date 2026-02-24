import java.util.Scanner;

public class FactorialCalculator {

    public static long calculateFactorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        scanner.close();

        try {
            long factorial = calculateFactorialIterative(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
public class FactorialRecursive {

    public static long calculateFactorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        // Base case: Factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive step: n * factorial of (n-1)
        return n * calculateFactorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        try {
            long factorial = calculateFactorialRecursive(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
import java.util.stream.IntStream;

public class FactorialStreams {

    public static long calculateFactorialStreams(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        // Generate a range from 1 to n (inclusive) and reduce by multiplication
        return IntStream.rangeClosed(1, n)
                        .mapToLong(i -> i) // Convert to long to avoid overflow sooner
                        .reduce(1, (long a, long b) -> a * b);
    }

    public static void main(String[] args) {
        int number = 6;
        try {
            long factorial = calculateFactorialStreams(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}