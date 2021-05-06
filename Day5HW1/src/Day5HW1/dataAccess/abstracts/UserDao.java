package Day5HW1.dataAccess.abstracts;

import java.util.List;

import Day5HW1.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	List<String> getAllMail();
	
	

}
