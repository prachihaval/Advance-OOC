import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorter {
    public static void main(String[] args) {
        // 1. Create a list and add 10 numbers (can be more or less)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(10);
        numbers.add(7);

        // Print the original list
        System.out.println("Original list: " + numbers);

        // 2. Sort the list in ascending order
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted list:   " + numbers);
    }
}
</code>

**Output:**