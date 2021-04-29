package oopOdev2;

public class Student extends User {

	private int studentNo;

	public Student(int id, String firstName, String lastName, int studentNo) {
		super(id, firstName, lastName);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	
}
