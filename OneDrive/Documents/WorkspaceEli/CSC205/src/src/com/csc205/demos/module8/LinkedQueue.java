package src.com.csc205.demos.module8;

public class LinkedQueue<T> implements Queue<T> {

	LinkedList<T> list;
	
	public LinkedQueue() {
		list = new SinglyLinkedList<>();
	}

	@Override
	public void offer(T e) {
		// TODO Auto-generated method stub
		list.addLast(e);
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return list.first();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	

	public void dequeue(String q) {
		// TODO Auto-generated method stub
		
	}
		
		
	
}

