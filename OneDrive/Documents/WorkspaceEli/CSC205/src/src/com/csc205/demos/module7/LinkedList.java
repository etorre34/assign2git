package src.com.csc205.demos.module7;

public interface LinkedList<E> extends Iterable<E>{
	
	void addFirst(E e);
	void addLast(E e);
	E getFirst();
	E getLast();
	E first();
	E last();
	boolean isEmpty();
	int size();
}
