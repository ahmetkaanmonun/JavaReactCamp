package oopHW3.ConsoleUI;

import oopHW3.Concrete.CampaignManager;
import oopHW3.Concrete.EDevletManager;
import oopHW3.Concrete.GameSellManager;
import oopHW3.Concrete.GamerManager;
import oopHW3.Entities.Campaign;
import oopHW3.Entities.Game;
import oopHW3.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		
		Game game1 = new Game(1,"GTA5",100,4);
		Gamer kaan = new Gamer(1,"Kaan","Monun","12345","1998");
		Campaign campaign1 = new Campaign(1,"Friday","10 day");
		
		GamerManager gamerManager = new GamerManager(new EDevletManager());
		gamerManager.add(kaan);
		
		CampaignManager campaignManager = new CampaignManager();
		
		
		campaignManager.add(campaign1);
		
		GameSellManager sellManager = new GameSellManager();
		
		sellManager.sell(game1, kaan, campaign1);
		

	}

}
