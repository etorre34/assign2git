package src.com.csc205.projects.project5;
/**
 * Bag class used for the Driver class
 * <p>
 * This class uses the interface Bag<T> to set up generic collection. Then I use the next next
 * within this class called MyBag<T> to implement Bag<T> to use the constructors.
 * <p>
 * 
 * author Elias Torres
 */
import java.util.ArrayList;
import java.util.Iterator;

public interface Bag<T> extends Iterable<T> {
	
	public boolean isEmpty();
	public int size();
	public void add(T item);
	public void clear();
	public T remove(T item);
	public T find(T item);
	
	public class MyBag<T> implements Bag<T> {
		
		private ArrayList<T> list = new ArrayList<T>();

		@Override
		public Iterator<T> iterator() {
			return null;
		}

		@Override
		public boolean isEmpty() {
			return list.isEmpty();
		}

		@Override
		public int size() {
			return list.size();
		}

		@Override
		public void add(T item) {
			list.add(item);
			
		}

		@Override
		public void clear() {
			
		}

		@Override
		public T remove(T item) {
			return list.remove(0);
		}

		@Override
		public T find(T item) {
			return null;
		}
		
	}

}
