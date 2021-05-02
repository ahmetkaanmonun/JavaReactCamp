package oopHW3.Concrete;

import oopHW3.Abstract.EDevletService;
import oopHW3.Entities.Gamer;

public class EDevletManager implements EDevletService{

	@Override
	public boolean verify(Gamer gamer) {
		
		if(gamer.getFirstName() == "Kaan" && gamer.getLastName() == "Monun" && gamer.getNationalId() == "12345" && gamer.getDateOfBirth() == "1998" ) {
			
			
			System.out.println("Do�rulama ba�ar�l�");
			return true;
			
		}
		else {
			
			System.out.println("Do�rulama ba�ar�s�z");
			return false;
			
		}
	}

}
