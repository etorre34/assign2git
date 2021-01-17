package src.com.csc205.demos.module8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<T> implements Queue<T> {

	List<T> list;
	
	public ArrayListQueue() {
		list = new ArrayList<>();
	}

	@Override
	public void offer(T e) {
		
		list.add(e);
		
	}

	@Override
	public T poll() {
		
		return list.remove(0);
	}

	@Override
	public T peek() {
		
		return list.get(0);
	}

	@Override
	public boolean isEmpty() {
		
		return list.isEmpty();
	}

	@Override
	public int size() {
		
		return list.size();
	}
}
