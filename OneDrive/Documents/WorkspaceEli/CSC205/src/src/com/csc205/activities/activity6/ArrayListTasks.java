package src.com.csc205.activities.activity6;

import java.util.ArrayList;
import java.util.List;

import src.com.csc205.activities.activity7.TaskList;

/**
 * 
 * @author Elias Torres
 *
 */
public class ArrayListTasks extends TaskList {

	List<Task> tasks;
	
	public ArrayListTasks() {
		tasks = new ArrayList<>();
	}

	@Override
	public void addTask(Task t) {
		// TODO Auto-generated method stub
		this.tasks.add(t);
	}

	@Override
	public void printTasks() {
		// TODO Auto-generated method stub
		this.tasks.forEach(System.out::println);
	}
}
