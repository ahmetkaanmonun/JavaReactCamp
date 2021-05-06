package Day5HW1.business.concretes;

import Day5HW1.business.abstracts.UserService;
import Day5HW1.core.GoogleService;
import Day5HW1.dataAccess.abstracts.UserDao;
import Day5HW1.entities.concretes.User;

public class UserManager implements UserService {
    
	private UserDao dao;
	private GoogleService gservice;

	public UserManager(UserDao dao,GoogleService gservice) {
		super();
		this.dao = dao;
		this.gservice = gservice;
	}

	@Override
	public void signUp(User user) {
		
		

		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		if ((user.getPassword().length() > 6) && user.getEmail().matches(regex) && !(dao.getAllMail().contains(user.getEmail())) 
				&& user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 ) {

			System.out.println("�yeli�iniz ba�ar� ile tamamlanm��t�r");
			this.dao.add(user);
			this.gservice.add(user);
			
		}
		else {
			
			System.out.println("�yelik olu�turulmad�.");
			
			
		}

	}

	@Override
	public void signIn(User user,String email,String password) {
		
		
		if(email == user.getEmail() && password == user.getPassword()  ) {
			
			System.out.println("Giri� yap�lm��t�r");
			
			
		}else {
			
			System.out.println("Giri� ba�ar�s�z");
			
		}

	}

}
