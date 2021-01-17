package src.com.csc205.demos.module6;

public class LinkedStack<T> implements Stack<T> {
	
	LinkedList<T> list;
	
	public LinkedStack() {
		list = new LinkedList<>();
		
	}

	@Override
	public boolean push(T t) {
		this.list.add(t);
		return true;
	}

	@Override
	public T pop() {
		return this.list.remove();
	}

	@Override
	public T peek() {
		return this.list.inspect();
	}

	@Override
	public boolean isEmpty() {
		
		return this.list.isEmpty();
	}

	@Override
	public int size() {
		
		return this.list.size();
	}
	
	

}
