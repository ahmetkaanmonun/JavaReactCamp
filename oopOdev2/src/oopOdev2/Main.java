package oopOdev2;

public class Main {

	public static void main(String[] args) {
		
		User student = new Student(1,"Kaan","Monun",165);
		
		User instructor = new Instructor(2,"Engin","Demiroğ",100000);
		
		UserManager studentManager = new StudentManager();
		
		studentManager.add(student);
		studentManager.delete(student);
		
		
		UserManager instructorManager = new InstructorManager();
		
		instructorManager.showsName(instructor);
		instructorManager.signUp(instructor);
	}

}
