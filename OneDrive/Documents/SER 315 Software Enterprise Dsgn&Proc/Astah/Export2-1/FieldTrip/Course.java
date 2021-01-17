package FieldTrip;

import java.util.List;

public class Course {

	private final int number;

	private final String dept;

	private final String description;

	private final int credits;

	private final Professor prof;

	private final Roster roster;

	private final FieldTrip[] trips;

	public String getName() {
		return null;
	}

	public int getCredits() {
		return 0;
	}

	public boolean addProfessor(Professor prof) {
		return false;
	}

	public Professor getProfessor() {
		return null;
	}

	public boolean enrollStudent(Student student) {
		return false;
	}

	public List getStudentNames() {
		return null;
	}

	public FieldTrip getFieldTrip(int number) {
		return null;
	}

}
