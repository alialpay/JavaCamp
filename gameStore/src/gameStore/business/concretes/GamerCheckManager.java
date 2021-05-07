package gameStore.business.concretes;

import gameStore.adapters.ValidationService;
import gameStore.entities.concretes.Gamer;

public class GamerCheckManager implements ValidationService {

	@Override
	public boolean userValidation(Gamer gamer) {

		return true;
	}

	
}
