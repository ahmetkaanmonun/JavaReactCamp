package Day5HW1.business.abstracts;

import Day5HW1.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void signIn(User user,String email,String password);
	

}
