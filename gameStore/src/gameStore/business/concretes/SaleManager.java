package gameStore.business.concretes;

import gameStore.entities.concretes.Campaign;
import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.Gamer;

public class SaleManager {
	public SaleManager(Game game, Gamer gamer, Campaign campaign) {
		
		System.out.println(gamer.getFirstName() + gamer.getLastName() + ", " 
				+ game.getGameName() + "  adl� oyunu "
				+ campaign.getName() + " adl� kampanya ile sat�n ald�");

	}
}
