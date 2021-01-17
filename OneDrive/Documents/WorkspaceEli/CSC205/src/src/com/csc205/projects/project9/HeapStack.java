package src.com.csc205.projects.project9;

import java.util.EmptyStackException;

/**
 * HeapStack used for Project 9.
 * 
 * @author
 *
 * @param <T>
 */
public class HeapStack<T> extends PriorityQueue<T> implements Stack<T> {

	// Backing object for the stack.
	PriorityQueue<T> priorityQueue;

	// Counter needed to keep track of entry into stack - used as priority in
	// the PriorityQueue.
	private int priorityCounter;

	public HeapStack() {
		this.priorityQueue = new PriorityQueue<>();
		this.priorityCounter = 0;
	}

	@Override
	public void push(T t) {
		// TODO Implement for Project 9
		priorityQueue.addElement(t, priorityCounter);
	}

	@Override
	public T pop() {
		// TODO Implement for Project 9
		T value = priorityQueue.removeNext();
		priorityCounter--;
		return value;
	}

	@Override
	public T peek() throws EmptyStackException  {
		// TODO Implement for Project 9
		if (isEmpty())
			throw new EmptyStackException();
		
		return priorityQueue.removeNext();
	}

	@Override
	public boolean isEmpty() {
		// TODO Implement for Project 9
		return priorityQueue.isEmpty();
	}

	@Override
	public int size() {
		// TODO Implement for Project 9
		return priorityQueue.size();
	}

}
