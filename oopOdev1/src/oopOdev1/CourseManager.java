package oopOdev1;

public class CourseManager {
	
	public void applyCourse(Course course) {
		
		System.out.println(course.detail + " is applied ");
		
		
	}
	public void courseComplete(Course course) {
		
		
		System.out.println(course.detail + " course has finished ");
		
		
	}
	public void showCourses(Course[] courses) {
		
		for (Course course : courses) {
			
			System.out.println("-------Course Information--------");
			System.out.println("Course Id : "+course.id);
			System.out.println("Course Name : "+course.name);
			System.out.println("Course Detail : "+course.detail);
			System.out.println("Course Lecturer : "+course.lecturer);
			System.out.println("---------------------------------");
			
		}
		
	}
	

}
