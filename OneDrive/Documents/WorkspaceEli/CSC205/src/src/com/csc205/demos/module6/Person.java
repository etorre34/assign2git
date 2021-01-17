package src.com.csc205.demos.module6;

public class Person {

	Person next;
	String name;
	
	public Person() {
		
		this("");
		
		
	}
	
	public Person(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person getNext() {
		return next;
	}
	
	public void setNext(String name, Person next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Person [next=" + next + ", name=" + name + "]";
	}

	
	}

	
	

