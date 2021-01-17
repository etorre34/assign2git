package src.com.csc205.demos.module6;

public class PersonDriver {

	public static void main(String[] args) {
		
		Person person1 = new Person(" Homer ");
		Person person2 = new Person();
		Person person3 = new Person("Dale");
		
		
		Node<Person> node1 = new Node<>(new Person("Kim"));
		Node<Person> node2 = new Node<>(new Person("Kelly"));
		Node<Person> node3 = new Node<>(new Person("Rin"));
		
		node1.setNext(node2);
		node2.setNext(node3);
		
		System.out.println(node1);
		//System.out.println(person2);
	}

}
