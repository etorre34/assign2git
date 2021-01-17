package src.com.csc205.demos.module6;

public class LinkedList<E> {

	
	private Node<E> head;
	private int count; //use for add and remove only
	
	
	public void add(E element) {
		//if (head == null) {
		//	head.setElement(element);
			//count++; 
			//or
		Node<E> temp = new Node<>();
		if (head == null) {
			this.head = temp;
			head.setElement(element);
			count++;
		}else {
			temp.setElement(element);
			temp.setNext(this.head);
			this.head = temp;
			count++;
		
		}
	}
	//O(1) no loops
	public E remove() {
		
		if (head == null) {
			return null;
		}
		E value = head.getElement();
		Node<E> temp = head;
		
		if (head.getNext() == null) {
			this.head = null;
		} else {
			
			
			this.head = head.getNext();
			temp.next = null;
		}
		
		return value;
		
	}
	//O(1) constant
	public E inspect() {
		return head.getElement();
	}
	//O(1) constant
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		
		return size() == 0;
	}
	
}
