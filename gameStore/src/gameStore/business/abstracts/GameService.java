package gameStore.business.abstracts;


import gameStore.entities.concretes.Game;

public interface GameService {
	
	void add(Game game);
	void update(Game game);
	void delete(int gameId);
}
