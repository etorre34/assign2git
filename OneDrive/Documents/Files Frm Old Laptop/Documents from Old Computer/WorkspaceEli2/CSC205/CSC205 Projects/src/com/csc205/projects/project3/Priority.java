package com.csc205.projects.project3;

/**
 * Priority interface class to interact with an object.
 * <p>
 * Has two methods being used to help interact with an object and
 * define a way to establish numeric priority among a set of objects.
 * This will then be extended to the Task class to be implemented.
 * <p>
 * 
 * Author Elias Torres
 *
 */
public interface Priority {
	/**
	 * Returns getPriority and setPriority.
	 */
	public int getPriority();
	public void setPriority(int priority);
}
