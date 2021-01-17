package src.com.csc205.projects.project7;
/**
 * SortingUtility class to be used with the driver class SortingDriver.
 * <p>
 * This class holds different methods that will compare data in the driver class by sorting 
 * the data that will be in the arrays. The methods we are using is selection sort, insertion sort, 
 * quick sort, merge sort, and a gonme sort. At the end, we are modifying the selection sort to descend
 * and the quick sort to become a quickersort. This class will also have the method to make a gnome and gnomier 
 * sort for the driver class. 
 * <p>
 * 
 * Output:
 * First 10 of Array...
 *1: 973098
 *2: 303176
 *3: 450623
 *4: 409694
 *5: 726035
 *6: 10321
 *7: 712822
 *8: 778586
 *9: 318579
 *10: 41097
 *
 *Part A...
 *
 *First 10 of Array...
 *1: 999819
 *2: 997835
 *3: 996606
 *4: 996108
 *5: 995861
 *6: 994735
 *7: 994705
 *8: 994172
 *9: 993564
 *10: 992553
 *
 *Part B...
 *
 *First 10 of Array...
 *1: 881
 *2: 1000
 *3: 1276
 *4: 2112
 *5: 2592
 *6: 3216
 *7: 3421
 *8: 3463
 *9: 3721
 *10: 3869
 *
 *Part C...
 *
 *First 10 of Array...
 *1: 881
 *2: 1000
 *3: 1276
 *4: 2112
 *5: 2592
 *6: 3216
 *7: 3421
 *8: 3463
 *9: 3721
 *10: 3869
 *
 *Part D...
 *
 *First 10 of Array...
 *1: 881
 *2: 1000
 *3: 1276
 *4: 2112
 *5: 2592
 *6: 3216
 *7: 3421
 *8: 3463
 *9: 3721
 *10: 3869
 *
 * @author Elias Torres
 *
 */
public class SortingUtility {

    
	/**
     * Sorts the specified array of integers using the selection sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void selectionSort(T[] data) {

        int min;

        for (int index = 0; index < data.length - 1; index++) {

            // Assume first value is min
            min = index;

            for (int scan = index + 1; scan < data.length; scan++) {

                // Find minimum value
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }

            // Swap minimum value with lowest index
            swap(data, min, index);
        }
    }

    /**
     * Swaps to elements in an array. Used by various sorting algorithms.
     *
     * @param data   the array in which the elements are swapped
     * @param index1 the index of the first element to be swapped
     * @param index2 the index of the second element to be swapped
     */
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }

    /**
     * Sorts the specified array of objects using an insertion sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for (int index = 1; index < data.length; index++) {

            T key = data[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }

            data[position] = key;
        }
    }

    /**
     * Sorts the specified array of objects using a bubble sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] data) {

        int position, scan;

        for (position = data.length - 1; position >= 0; position--) {

            for (scan = 0; scan <= position - 1; scan++) {

                if (data[scan].compareTo(data[scan + 1]) > 0)
                    swap(data, scan, scan + 1);
            }
        }
    }

    /**
     * Sorts the specified array of objects using the quick sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void quickSort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    /**
     * Recursively sorts a range of objects in the specified array using the
     * quick sort algorithm.
     *
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {

        if (min < max) {

            // create partitions
            int indexofpartition = partition(data, min, max);

            // sort the left partition (lower values)
            quickSort(data, min, indexofpartition - 1);

            // sort the right partition (higher values)
            quickSort(data, indexofpartition + 1, max);
        }

    }

    /**
     * Used by the quick sort algorithm to find the partition.
     *
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {

        T partitionelement;
        int left, right;
        int middle = (min + max) / 2;

        // use the middle data value as the partition element
        partitionelement = data[middle];

        // move it out of the way for now
        swap(data, middle, min);

        left = min;
        right = max;

        while (left < right) {

            // search for an element that is > the partition element
            while (left < right && data[left].compareTo(partitionelement) <= 0)
                left++;

            // search for an element that is < the partition element
            while (data[right].compareTo(partitionelement) > 0)
                right--;

            // swap the elements
            if (left < right)
                swap(data, left, right);

        }

        // move the partition element into place
        swap(data, min, right);

        return right;
    }

    /**
     * Sorts the specified array of objects using the merge sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void mergeSort(T[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    /**
     * Recursively sorts a range of objects in the specified array using the
     * merge sort algorithm.
     *
     * @param data the array to be sorted
     * @param min  the index of the first element
     * @param max  the index of the last element
     */
    private static <T extends Comparable<T>> void mergeSort(T[] data, int min, int max) {

        if (min < max) {

            int mid = (min + max) / 2;
            mergeSort(data, min, mid);
            mergeSort(data, mid + 1, max);
            merge(data, min, mid, max);

        }
    }

    /**
     * Merges two sorted subarrays of the specified array.
     *
     * @param data  the array to be sorted
     * @param first the beginning index of the first subarray
     * @param mid   the ending index fo the first subarray
     * @param last  the ending index of the second subarray
     */
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] data, int first, int mid, int last) {

        T[] temp = (T[]) (new Comparable[data.length]);

        int first1 = first, last1 = mid; // endpoints of first subarray
        int first2 = mid + 1, last2 = last; // endpoints of second subarray
        int index = first1; // next index open in temp array

        // Copy smaller item from each subarray into temp until one
        // of the subarrays is exhausted
        while (first1 <= last1 && first2 <= last2) {
            if (data[first1].compareTo(data[first2]) < 0) {
                // Not sorted
                temp[index] = data[first1];
                first1++;
            } else {
                // sorted
                temp[index] = data[first2];
                first2++;
            }
            index++;
        }

        // Copy remaining elements from first subarray, if any
        while (first1 <= last1) {
            temp[index] = data[first1];
            first1++;
            index++;
        }

        // Copy remaining elements from second subarray, if any
        while (first2 <= last2) {
            temp[index] = data[first2];
            first2++;
            index++;
        }

        // Copy merged data into original array
        for (index = first; index <= last; index++)
            data[index] = temp[index];
    }

    /**
     * Part A -
     * Modified selection sort.
     * This method takes an array and sorts it from descending to ascending order.
     * To change the method to sort in descending order, the variable must be max instead of min. 
     * Once the variable is declared max, we then change everywhere that says "min" to "mex".
     * In the If statement, we also have to change the sign from less then to greater then 0
     * to finish the method.
     * @param data
     * @param <T>
     */
    public static <T extends Comparable<T>> void selectionSortDescending(T[] data) {

    	// TODO implement descending selection sort for part a
    	
    	 int max;

         for (int index = 0; index < data.length - 1; index++) {

             // Assume first value is min
             max = index;

             for (int scan = index + 1; scan < data.length; scan++) {

                 // Find maximum value
                 if (data[scan].compareTo(data[max]) > 0) {
                     max = scan;
                 }
             }

             // Swap maximum value with highest index
             swap(data, max, index);
         }
     }


    /**
     * Part B
     * Modified quick sort.
     *
     * @param data
     * @param <T>
     */
    public static <T extends Comparable<T>> void quickerSort(T[] data) {
        quickerSort(data, 0, data.length - 1);
    }

    /**
     * Part B
     * Modified quick sort.
     * To modify the quicksort method into the quickerSort method, we must add two If statements
     * to the method beginning with the minimum to equal the maximum minus 1. We then use another
     * If statement to compare the max we have from the result of the first If statment and if that 
     * equals 1, then we will swap the data between the minimum and maximum. During the swap, if the 
     * minimum data is less then the maximum data, it will create partitions just like the quick sort.
     * @param data
     * @param min
     * @param max
     * @param <T>
     */
    private static <T extends Comparable<T>> void quickerSort(T[] data, int min, int max) {

        if (min == (max - 1)) { // partition size of 2
        	// TODO implement quicker sort here for part b

        	if (data[min].compareTo(data[max]) == 1) {
        		
        		swap(data, min, max);
        		
        	}
        
        	} else if (min < max) {

            // create partitions
            int indexofpartition = partition(data, min, max);

            // sort the left partition (lower values)
            quickerSort(data, min, indexofpartition - 1);

            // sort the right partition (higher values)
            quickerSort(data, indexofpartition + 1, max);
        }
    }


    /**
     * Part C
     * Gnome Sort Algorithm
     * <p>
     * Implement gnome sort per this pseudo code.
     * <p>
     * <pre>
     *    method gnomeSort(a[])
     *       pos = 0
     *       while pos < length(a)
     *          if (pos == 0 or a[pos] >= a[pos-1])
     *          pos = pos + 1
     *       else
     *          swap a[pos] and a[pos-1]
     *          pos = pos - 1
     * </pre>
     * To use the gnomeSort, we changed the python code into java code by first initializing position to be
     * "pos" to equal 0. Using a while loop, while the position is less then the length of the data, we then use 
     * the If statement to see the position equal 0 or if subtracting 1 from the position is greater then or equal 
     * to 0, then we shall increment the position by 1. If that doesn't happen during the sort, then we will swap
     * the data by taking the position and decrementing it by 1. 
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

    	// TODO implement gnome sort for part c
    	
     int pos = 0;
     
     while (pos < data.length) {
    	 if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0) {
    		 pos++;
    	 }else {
    		 swap(data, pos, pos - 1);
    			 pos--;
    	 	}
     	}
     }
    
    private void swap(int[] data, int i, int j) {
    	int temp;
    	temp = data[i];
    	data[i] = data[j];
    	data[j] = temp;
    }

	/**
     * Part D1
     * Optimized Gnome Sort Algorithm.
     * <p>
     * Implement an optimized gnome sort per the pseudo code below.
     * <p>
     * <pre>
     *    method gnomierSort(a[])
     *       for pos in 1 to length(a)
     *       gnomierSort(a, pos)
     * </pre>
     * To implement the first part of the gnomierSort, we will create a For loop statement with position 
     * to equal 1 and be less then the data length, then the position will increment by 1. During the For
     * loop, the gnomierSort will be implemented using the data and postion. 
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        // TODO implement optimized gnome sort for part d1.  This method will call the method below.
    	for (int pos = 1; pos < data.length; pos++) {
    		
    		
			gnomierSort(data, pos);
    	}
    }


    /**
     * Part D2
     * Optimized Gnome Sort Algorithm
     * <p>
     * Implement an optimized gnome sort per the pseudo code below.
     * <p>
     * <pre>
     *    method gnomierSort(a[], upperBound)
     *       pos = upperBound
     *       while pos > 0 and a[pos-1] > a[pos]
     *          swap a[pos-1] and a[pos]
     *       pos = pos - 1
     * </pre>
     * For the second part of the gnomierSort method, will will initialize position to equal upperBound. Next is to 
     * create a While loop which will compare the position to the data and swap the data by decrementing the postion and the
     * present position. 
     * @param data
     * @param <T>
     */
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        // TODO implement optimized gnome sort for part d2
    	int pos = upperBound;
    	
    	while (pos > 0 && data[pos - 1].compareTo(data[pos]) == 1) {
    		swap(data,pos - 1, pos);
    		pos--;
    		
    	}
    	
    }

}





