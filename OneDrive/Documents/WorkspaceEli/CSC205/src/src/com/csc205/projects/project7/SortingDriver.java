package src.com.csc205.projects.project7;

import java.util.Arrays;
import java.util.Random;
/**
 * SortingDriver is used with the SortingUtility class to perform the different sorting
 * methods and gnome sort. 
 * @author Elias Torres
 *
 */
public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        final int ARRAY_SIZE = 1000;
        Random generator = new Random();
        Integer[] arr = new Integer[ARRAY_SIZE];

        for (int x = 0; x < ARRAY_SIZE; x++) {
            int value = generator.nextInt(1000000);
            arr[x] = new Integer(value);
        }

        // List first 10 unsorted elements...
        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);
        Integer[] copy4 = copyArray(arr);

        // Test 2a
        System.out.println("\nPart A...");
        SortingUtility.selectionSortDescending(copy1);
        printFirstTenOfArray(copy1);

        // Test 2b
        System.out.println("\nPart B...");
        SortingUtility.quickerSort(copy2);
        printFirstTenOfArray(copy2);

        // Test 2c
        System.out.println("\nPart C...");
        SortingUtility.gnomeSort(copy3);
        printFirstTenOfArray(copy3);

        // Test 2d
        System.out.println("\nPart D...");
        SortingUtility.gnomierSort(copy4);
        printFirstTenOfArray(copy4);

    }

    /**
     * Prints the first 10 members of the array.
     * <p>
     * This method works because even if the class type doesn't implement a
     * toString() method (which it should), it at least inherits that method
     * from Object.
     *
     * @param obj
     */
    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {

            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    /**
     * Make a deep copy of the array (values are copied).
     *
     * @param obj
     * @return
     */
    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);

        return copy;
    }

}
