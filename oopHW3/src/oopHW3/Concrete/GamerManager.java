package oopHW3.Concrete;

import oopHW3.Abstract.EDevletService;
import oopHW3.Abstract.GamerService;
import oopHW3.Entities.Gamer;

public class GamerManager implements GamerService{
	
	
	
	private EDevletService edevletService;

	public GamerManager(EDevletService edevletService) {
		super();
		this.edevletService = edevletService;
	}

	@Override
	public void add(Gamer gamer) {
		
		
		if(edevletService.verify(gamer)) {
			
			System.out.println("Oyuncu eklendi : " + gamer.getFirstName());
		}
		else {
			
			System.out.println("Ekleme baþarýsýz");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Oyuncu bilgileri güncellendi : " + gamer.getFirstName());
	}
	

}
