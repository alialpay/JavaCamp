package gameStore.business.abstracts;

import gameStore.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);

	void delete();

	void update();
}
