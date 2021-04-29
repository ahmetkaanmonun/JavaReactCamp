package oopOdev2;

public class Instructor extends User {
	
	private int salary;

	public Instructor(int id, String firstName, String lastName, int salary) {
		super(id, firstName, lastName);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	
	

}
