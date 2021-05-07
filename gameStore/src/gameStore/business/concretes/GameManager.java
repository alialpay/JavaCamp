package gameStore.business.concretes;


import gameStore.business.abstracts.GameService;
import gameStore.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		
		System.out.println("Oyun eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi");
		
	}

	@Override
	public void delete(int gameId) {
		System.out.println("Oyun silindi");
		
	}

	

}
