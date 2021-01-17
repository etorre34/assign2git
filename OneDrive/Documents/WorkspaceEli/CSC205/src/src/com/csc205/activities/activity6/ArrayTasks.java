package src.com.csc205.activities.activity6;

import src.com.csc205.activities.activity7.TaskList;

/**
 * Created by Ray on 6/6/2016.
 */
public class ArrayTasks extends TaskList {

    Task[] tasks;
    private int counter;

    public ArrayTasks(int i) {
        super();
        tasks = new Task[i];
        counter = 0;
    }

    @Override
    public void addTask(Task t) {

        if (counter <= tasks.length) {
            this.tasks[counter] = t;
            counter++;
        }

    }

    @Override
    public void printTasks() {
        for (int x = 0; x < tasks.length; x++) {
            System.out.println(tasks[x]);
        }
    }

    public Task getTask() {

        if (counter > 0) {
            Task tempTask = tasks[counter];
            tasks[counter] = null;
            counter--;
            return tempTask;
        } else {
            return null;
        }
    }
}
