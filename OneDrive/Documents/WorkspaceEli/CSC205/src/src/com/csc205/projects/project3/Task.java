package src.com.csc205.projects.project3;

/**
 * Task class that implements the Priority interface class.
 * <p>
 * Has methods that sets up and gets the constructor priority. Uses 
 * an if statement method in the mutator to be inherited to the Task
 * driver class.
 * <p>
 * 
 * Author Elias Torres
 *
 */

public class Task implements Priority{
	
	/**
	 * constructor
	 */
	private int priority;
	
	public Task() {
		
	}
	/**
	 * Used to set up priority
	 * @param priority
	 */
	public Task(int priority) {
		
		this.priority = priority;
	}
	/**
	 * Sets priority using an if statement.
	 */
	public void setPriority(int priority) {
		
		this.priority = priority;
		
		if (priority == 1)
			System.out.println("Low: Not Important");
		else if (priority == 2)
				System.out.println("Medium: Somewhat Important");
		else if (priority == 3)
			System.out.println("High: Very Important");
		else
			System.out.println("Wrong entry, Please enter a number from "
					+ "1 through 3 with 1 being low and 3 being high.");
	}
	/**
	 * returns priority.
	 */
	public int getPriority() {
		
		return this.priority;
	}
	

}
