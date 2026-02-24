import java.util.Arrays;

public class MergeSortedArrays {

    /**
     * Merges two sorted integer arrays into a single sorted array.
     * 
     * @param arr1 The first sorted array.
     * @param arr2 The second sorted array.
     * @return A new array containing all elements from arr1 and arr2 in sorted order.
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        // Pointers for arr1, arr2, and mergedArray
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and add the smaller element to mergedArray
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // If elements are remaining in arr1, add them
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // If elements are remaining in arr2, add them
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] merged = merge(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}