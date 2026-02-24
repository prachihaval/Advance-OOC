public class PrimeChecker {

    public static void main(String[] args) {
        // Check if exactly one command-line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java PrimeChecker <number>");
            return;
        }

        long number;
        try {
            // Parse the command-line argument to a long
            number = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter an integer.");
            return;
        }

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    /**
     * Checks if a given number is prime.
     * @param n The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(long n) {
        // 1. Handle edge cases: numbers less than 2 are not prime
        if (n <= 1) {
            return false;
        }

        // 2. Iterate from 2 up to the square root of n
        // If any number divides n evenly, n is not prime.
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }

        // 3. If no divisors were found, the number is prime
        return true;
    }
}