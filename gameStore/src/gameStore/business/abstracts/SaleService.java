package gameStore.business.abstracts;

import gameStore.entities.concretes.Campaign;
import gameStore.entities.concretes.Game;
import gameStore.entities.concretes.Gamer;

public interface SaleService {
	void SaleGame(Gamer gamer, Game game, Campaign campaign);
}
