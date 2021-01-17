package src.com.csc205.demos.module7;

import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new SinglyLinkedList<>();
		
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(4);
		list.addLast(5);
		//list.addLast(8);
		
		for (Integer value : list) {
			System.out.print(value + " ");
			
		}
		
		System.out.println();
		list.forEach(System.out:: println);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		//System.out.println(list.first());
		//System.out.println(list.getFirst());
		
		//list.getFirst();
		//list.getFirst();
		

	}

}
