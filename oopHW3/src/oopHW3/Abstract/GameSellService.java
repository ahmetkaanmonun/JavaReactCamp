package oopHW3.Abstract;

import oopHW3.Entities.Campaign;
import oopHW3.Entities.Game;
import oopHW3.Entities.Gamer;

public interface GameSellService {
	
	
	void sell(Game game,Gamer gamer);
	void sell(Game game,Gamer gamer,Campaign campaign);

}
