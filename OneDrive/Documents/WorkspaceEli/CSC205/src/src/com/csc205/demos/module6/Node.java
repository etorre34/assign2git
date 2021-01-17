package src.com.csc205.demos.module6;

public class Node<E> {

	Node<E> next;
	E element;
	
	public Node() {
		
	}
	
	public Node(E element) {
		this.element = element;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [element=" + element + "]";
	}




	
}
