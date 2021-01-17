package com.csc205.projects.project3;

/**
 * Task driver is to show priorities.
 * <p>
 * Has methods to make a new task to show the priority of the task and the number
 * how important the task is. It also gets a message from the child class task which
 * depends on the number that is put in like 1, 2 or 3. If a different number is put
 * into the task, then a message will show saying to enter a number of importance from
 * only 1 through 3.
 * <p>
 * Output:
 * 
 * <p>
 * The first task has a priority of: 1
 *Low: Not Important
 *
 *The second task has a priority of: 2
 *Medium: Somewhat Important
 *
 *The third task has a priority of: 3
 *High: Very Important
 *<p>
 *
 * Author Elias Torres
 *
 */

public class TaskDriver {
	/**
	 * Creates a new task to show the priority number and how important
	 * the task is.
	 */
	public static void main(String[] args) {
		/**
		 * Creates a new task.
		 */
		Task task1 = new Task(1);
		Task task2 = new Task(2); 
		Task task3 = new Task(3);
		/**
		 * Prints out the priority number and how important the task
		 * is.
		 */
		System.out.println("The first task has a priority of: " + task1.getPriority());
		task1.setPriority(1);
		System.out.print("\n");
		
		System.out.println("The second task has a priority of: " + task2.getPriority());
		task2.setPriority(2);
		System.out.print("\n");
		
		System.out.println("The third task has a priority of: " + task3.getPriority());
		task3.setPriority(3);
		
	}


}
