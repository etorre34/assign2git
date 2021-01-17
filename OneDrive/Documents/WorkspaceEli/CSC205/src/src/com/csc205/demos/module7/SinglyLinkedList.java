package src.com.csc205.demos.module7;

import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.naming.OperationNotSupportedException;

public class SinglyLinkedList<E> implements LinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public SinglyLinkedList() { //Constructor
		this.size = 0;
		head = tail = null; //right to left
	}
	
	
	
	@Override
	public void addFirst(E e) {
		
		Node<E> newNode = new Node<>(e); //1.Create the Node
		
		if (!isEmpty()) {
			this.head = this.tail = newNode;
			this.head.next = null;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		
		this.size++;
	}

	@Override
	public void addLast(E e) {
		
		Node<E> newNode = new Node<>(e);
		
		if (!isEmpty()) {
			
			this.tail = this.head = newNode; //pointing at the same bucket
			this.tail.next = null;
			
		} else {
			this.tail.next = newNode;
			this.tail = newNode; //moving the tail over
		}
		
		this.size++;
	}

	@Override
	public E getFirst() {
		
		if (isEmpty()) {
			throw new NoSuchElementException("Empty list");
		}
		
		E returnValue = this.head.element;
		
		this.head = this.head.next;
		this.size--;
		
		if (isEmpty()) {
			this.tail = null;
		}
		
		if (size == 1) {
			this.tail = this.head;
		}
		
		return returnValue;

	}

	@Override
	public E getLast() {
		
		if (isEmpty()) {
			throw new NoSuchElementException("Empty list");
		}
		
		E returnValue = this.tail.element;
		
		if (this.size == 1) {
			getFirst(); //Use the same methods in getFirst, Shortcut
		} else {
			
			Node<E> newLast = this.head;
			while(newLast.next != this.tail) { //Comparing the node references, testing to see if those two references are alien from eachother
				newLast = newLast.next;
			}
			
			tail = newLast;
			this.tail.next = null;
			
			size--;
		}
		
		return returnValue;
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new NoSuchElementException("Empty list");
		}
		return this.head.element;
		//E returnValue = head.element;
		//return returnValue;
	}

	@Override
	public E last() {
		if (isEmpty()) {
			throw new NoSuchElementException("Empty list");
		}
		
		E returnValue = this.tail.element;
		
		return returnValue;
	}
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.size == 0);
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	private static class Node<E> { //This is the class is the only one that uses it...Test question 
		                           // The E being used here is seperate from the E on top
	
		Node<E> next; //Inner classes don't need getters and setters
		E element;
		
		Node(E e) {
			this.element = e;
			this.next = null;
		}
		
	
	}

	@Override
	public Iterator<E> iterator() {
		
		//try {
			//throw new OperationNotSupportedException();
		//} catch (OperationNotSupportedException e) {
		// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		return new LinkedListIterator<E>(this.head);
	}

	private class LinkedListIterator<E> implements Iterator<E> {

		
		private Node<E> current;//pointer: Where it is pointing at for the bucket
		
		public LinkedListIterator (Node<E> start) {
			this.current = start;
		}
		
		@Override
		public boolean hasNext() {
			
			return (current != null);
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			if (!hasNext()) {
				throw new NoSuchElementException("No more elements!s");
			}
			
			E ret = current.element;
			current = current.next;
			
			return ret;
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
