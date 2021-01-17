package src.com.csc205.demos.module9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StreamDriver {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a1" , "a2" , "b1", "b2", "c2", "c1", "d2", "d1" , "c3") ;
		
		Queue<String> myQueue = new LinkedList<String>();
		
		myList
			.stream()
			.filter(st -> st.startsWith("c"))//filter everything that doesn'ts start with a c
			.map(String::toUpperCase) // :: means lamdas also called method reference
			.sorted()
			.forEach(myQueue::add);
		
		myQueue.forEach(System.out::println);
			
			
	}
}
