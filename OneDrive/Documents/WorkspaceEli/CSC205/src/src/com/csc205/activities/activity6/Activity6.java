package src.com.csc205.activities.activity6;

import src.com.csc205.activities.activity7.TaskList;

/**
 * 
 * @author Elias Torres
 *
 */
public class Activity6 {

	public static void main(String[] args) {

		final int NUMLISTS = 3;
		
		/* Makes one of each type of task list */
		TaskList[] list = new TaskList[NUMLISTS];//Polymorphism is set up here.
		list[0] = new ThreeTasks();
		list[1] = new ArrayTasks(3);
		list[2] = new ArrayListTasks();
		
		for (int ii=0;ii<list.length;ii++) {
			list[ii].addTask(new Task("Install Eclipse upgrade", 4));
			list[ii].addTask(new Task("Do Project 4", 8));
			list[ii].addTask(new Task("Learn about lists", 7));
		}
		
		for (int ii=0;ii<list.length;ii++) {
			System.out.println("List " + (ii + 1) + ":");
			list[ii].printTasks();
			System.out.println();
		}
	}

}
//What lines have polymorphism method calls? All 3 addTask and printTask