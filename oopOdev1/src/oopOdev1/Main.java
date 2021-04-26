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
	StudentManager studentManager= new StudentManager();
	studentManager.showStudents(students);
	
	
	//Course elements are printed to the screen from an array.
	CourseManager courseManager = new CourseManager();
	courseManager.showCourses(courses);
	
	//CourseManager objects created
	CourseManager courseManager1 = new CourseManager();
	
	courseManager1.applyCourse(course1);
	courseManager1.courseComplete(course2);
		

	}

}
