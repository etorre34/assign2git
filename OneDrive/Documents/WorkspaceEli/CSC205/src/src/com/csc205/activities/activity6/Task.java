package src.com.csc205.activities.activity6;

/* Simple prioritized task class */

public class Task implements Priority {

	private String name;
	private int priority;

	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}

	public void setPriority(int p) {
		priority = Math.max(p, 0);
	}

	public int getPriority() {
		return priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + " [" + priority + "]";
	}
}
