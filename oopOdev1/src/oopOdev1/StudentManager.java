package oopOdev1;

public class StudentManager {
	
	public void showStudents(Student[] students) {
		
		for (Student student : students) {
			System.out.println("-------Students Info--------");
			System.out.println("Student Id : "+student.id);
			System.out.println("Student Name : "+student.name);
			System.out.println("Student Surname : "+student.surname);
			System.out.println("Student Email : "+student.email);
			System.out.println("----------------------------");
		}
		
		
	}

}
