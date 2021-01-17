package src.com.csc205.activities.activity6;

import src.com.csc205.activities.activity7.TaskList;

/**
 * Created by Ray on 6/6/2016.
 */
public class ThreeTasks extends TaskList {

    Task task1;
    Task task2;
    Task task3;

    public Task getTask1() {
        return task1;
    }

    public void setTask1(Task task1) {
        this.task1 = task1;
    }

    public Task getTask2() {
        return task2;
    }

    public void setTask2(Task task2) {
        this.task2 = task2;
    }

    public Task getTask3() {
        return task3;
    }

    public void setTask3(Task task3) {
        this.task3 = task3;
    }

    public ThreeTasks() {

    }

    @Override
    public void addTask(Task t) {

        if (task1 == null) {
            task1 = t;
        } else if (task2 == null) {
            task2 = t;
        } else if (task3 == null) {
            task3 = t;
        } else {
            System.out.println("Task not added - tasklist full.");
        }
    }

    @Override
    public void printTasks() {
        System.out.println(this.task1);
        System.out.println(this.task2);
        System.out.println(this.task3);
    }
}
