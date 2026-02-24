import java.util.Arrays;
import java.util.Scanner;

public class SortNamesAlphabetically {
    public static void main(String[] args) {
        int count = 10;
        String[] names = new String[count];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 names one by one:");

        // Loop to take input of 10 names from the user
        for (int i = 0; i < count; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Close the scanner
        scanner.close();

        // Sort the array of names in alphabetical (lexicographical) order
        Arrays.sort(names);

        // Display the names in sorted order
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}