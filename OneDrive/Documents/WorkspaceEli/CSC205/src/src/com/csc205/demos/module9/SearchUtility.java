package src.com.csc205.demos.module9;

public class SearchUtility {

	public static int linearSearch(int[] arr, int target) {
		
		int found = -1;
		
		for(int x = 0; x < arr.length; x++) {
			
			if (arr[x] == target) {
				found = target;
				break;
			}
		}
		
		return found;
		
		
	}
	
	public static<T> T linearSearch(T[] arr, T target) {
		//public static<T extends Comparable<T>> T linearSearch(T[] arr, T target) {
		
		T found = null; //if object is not found, return null;
		
		for(T value : arr) {
			//if (value.compareTo(target) == 0) {
				if (value == target) {
				found = target;
				break;
			}
		}
		return found;
	}//End of Linear Search
	
	public static int binarySearchIterative(int[] arr, int target) { //Performance of Iterable version is O(log n), better then O(n) because were cutting the performance by half.
		
		int min = 0;
		int max = arr.length - 1;
		
		while (min <= max) { //while searching for values
			
			int mid = min + (max - min) / 2;
			
			if (arr[mid] == target) {
				return mid;//this is being used as the break
			} else if (arr[mid] < target) {//mid is less then the target
				min = mid + 1;
			} else {
				max = mid - 1; //targets less then mid
				
			}
			
			
		}
		
		return -1;//If we don't find the value;
	}//End of Binary Search
	
	public int binarySearchRecursive(int[] arr, int target) {
		return binarySearchRecursive(arr, 0, (arr.length - 1), target);//performance is log n but the method is constant. This is log n because the bottom is log n.

	}
	
	private int binarySearchRecursive(int[]arr, int min, int max, int target) {//What the recursive shall use, How to get growth function better 
		
		if (max >= min) {
			
			int mid = min + (max - min) / 2;
			
			
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				return binarySearchRecursive(arr, min, mid - 1, target);
			} else {
				return binarySearchRecursive(arr, mid + 1, max, target);
			}
			
			
		}
		
		return -1;
		
		
	}
	
	
}


