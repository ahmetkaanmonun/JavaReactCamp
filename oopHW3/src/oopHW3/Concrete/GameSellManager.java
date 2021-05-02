package oopHW3.Concrete;

import oopHW3.Abstract.GameSellService;
import oopHW3.Entities.Campaign;
import oopHW3.Entities.Game;
import oopHW3.Entities.Gamer;

public class GameSellManager implements GameSellService{

	@Override
	public void sell(Game game, Gamer gamer) {
		
		System.out.println(game.getName() + "game sold to : " + gamer.getFirstName());
		
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		
		System.out.println(game.getName() + " game sold with sale : " + campaign.getName() + " to " + gamer.getFirstName());
	}

}
