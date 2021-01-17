package src.com.csc205.projects.project9;

/**
 * Classic stack operations.
 * 
 * @author Ray Hedgecock
 *
 * @param <T>
 */
public interface Stack<T> {
	
	public void push(T t);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public int size();

}
