package src.com.csc205.demos.module10;

public class SortingUtility2 {

	public static <T extends Comparable<T>> void selectionSort(T[] data) {
		
		int min;
		
		for (int index = 0; index < data.length - 1; index++) {
			
			min = index; //assume first value is min
			
			for (int scan = index + 1; scan < data.length; scan++) {
				
				if (data[scan].compareTo(data[min] < 0) { //find min value
					
					min = scan;
				}
			}
			
			swap(data, min, index);
		}
	}
}
