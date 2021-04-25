package oopOdev1;

public class Main {

	public static void main(String[] args) {
		
	//Student objects created.	
	Student student1 = new Student(1,"Kaan","Monun","kaan@gmail.com");
	Student student2 = new Student(2,"Ahmet","Monun","ahmet@gmail.com");
	Student student3 = new Student(3,"Ali","Monun","ali@gmail.com");
	
	//Student objects stored in an array.
	Student[] students = {student1,student2,student3};
	
	
	//Course objects created.
	Course course1 = new Course(1,"Yazılım Geliştirme Kampı","Engin Demiroğ","C# & Angular Kursu");
	Course course2 = new Course(2,"Yazılım Geliştirme Kampı","Engin Demiroğ","Java & React Kursu");
	
	//Course objects stored in an array.
	Course[] courses = {course1,course2};
	
	//Student elements are printed to the screen from an array.
	for (Student student : students) {
		
		System.out.println("---------Student Information----------");
		System.out.println(" Student id : " + student.id);
		System.out.println(" Student name : " +student.name);
		System.out.println(" Student surname : " +student.surname);
		System.out.println(" Student email : " +student.email);
		System.out.println("--------------------------------------");
	}
	
	//Course elements are printed to the screen from an array.
	for (Course course : courses) {
		
		System.out.println("---------Course Information----------");
		System.out.println(" Course id : " + course.id);
		System.out.println(" Course name : " + course.name);
		System.out.println(" Course lecturer : " + course.lecturer);
		System.out.println(" Course detail : " + course.detail);
		System.out.println("--------------------------------------");
		
	}
	
	//CourseManager objects created
	CourseManager courseManager = new CourseManager();
	
	courseManager.applyCourse(course1);
	courseManager.courseComplete(course2);
		

	}

}
