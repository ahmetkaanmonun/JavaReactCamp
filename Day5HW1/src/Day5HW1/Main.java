package Day5HW1;

import Day5HW1.business.concretes.UserManager;
import Day5HW1.core.GoogleManagerAdapter;
import Day5HW1.dataAccess.concretes.HibernateUserDao;
import Day5HW1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User kaan = new User(1,"Kaan","Mönün","ahmetkaan.monun@outlook.com","1234567");
		
		User ahmet = new User(2,"Ahmet","Mönünu","ahmetkaan.monun@outlook.com","12345678");
		
		UserManager manager = new UserManager(new HibernateUserDao(),new GoogleManagerAdapter());
		
		manager.signIn(kaan, "ahmetkaanmonun@outlook.com", "1234567");
		
		manager.signUp(kaan);
		
		manager.signUp(ahmet);

	}

}
