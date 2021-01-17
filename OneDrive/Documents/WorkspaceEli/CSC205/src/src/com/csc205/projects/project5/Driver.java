package src.com.csc205.projects.project5;
/**
 * Driver class that will use Bag class
 * <p>
 * This class has methods that calls the methods from the Bag class and use 
 * it as a collections list to print out tthe list using ArrayList. 
 * <p>
 * 
 * <pre>
 * orange, Beach ball, Sunscreen, Towel
 * 4
 * <pre>
 * 
 * author Elias Torres
 * 
 */
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		/**
		 * ArraryList of items
		 */
		Bag<String> items = new Bag<String>();
		
		items.add("orange");
		items.add("Beach ball");
		items.add("Sunscreen");
		items.add("Towel");
		System.out.println(items.size());
		
		items.remove("Shirt");
		System.out.println(items.size());
		
		
	
	}
}


