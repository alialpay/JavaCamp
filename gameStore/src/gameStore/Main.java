package gameStore;

import gameStore.adapters.ValidationManager;
import gameStore.business.concretes.GamerManager;
import gameStore.business.concretes.SaleManager;
import gameStore.entities.concretes.Campaign;
import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.Gamer;

public class Main {
	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "11111111111", "Ali ", "Alpay", 1996);
		GamerManager gamerManager = new GamerManager(new ValidationManager());
		gamerManager.add(gamer1);
		
		Game game1 = new Game(1,"CALL OF DUTY", 40);
		Campaign campaign1 = new Campaign(1,"BAHAR", 3);
		SaleManager manager = new SaleManager(game1, gamer1, campaign1);

	}

}
