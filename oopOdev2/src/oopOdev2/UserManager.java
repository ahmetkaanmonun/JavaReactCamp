package oopOdev2;

public class UserManager {
	
	public void showsName(User user) {
		
		System.out.println("Adý : " + user.getFirstName());
		
	}
	public void signUp(User user) {
		
		System.out.println(user.getFirstName() +  " kaydoldu");
		
		
		
	}
	public void add(User user) {
		
		System.out.println(user.getFirstName() +  " eklendi");
		
		
	}
	public void delete(User user) {
		
		System.out.println(user.getFirstName() +  " silindi");
		
	}
	public void update(User user) {
		
		
		System.out.println(user.getFirstName() +  " bilgileri güncellendi");
		
	}

}
