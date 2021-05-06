package Day5HW1.core;

import Day5HW1.entities.concretes.User;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void add(User user) {
		
		System.out.println("Google ile üye olundu " + user.getFirstName());
		
	}
	
	

}
