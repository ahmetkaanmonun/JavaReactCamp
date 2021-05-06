package Day5HW1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Day5HW1.dataAccess.abstracts.UserDao;
import Day5HW1.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>(); 
	

	@Override
	public void add(User user) {
		
		System.out.println("Hibernate ile üye olundu " + user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getAllMail() {
		// TODO Auto-generated method stub
		
		List<String> emails = new ArrayList<String>();
		
		for(User user:users) {

			emails.add(user.getEmail());
			
			
			
		}
		
		return emails;
		
		
	}

}
