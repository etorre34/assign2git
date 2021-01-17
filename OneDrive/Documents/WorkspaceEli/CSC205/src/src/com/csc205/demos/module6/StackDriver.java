package src.com.csc205.demos.module6;

public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new LinkedStack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop()); //This should be 3
		System.out.println(stack.pop()); //This should be 2
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
