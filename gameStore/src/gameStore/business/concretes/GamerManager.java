package gameStore.business.concretes;

import gameStore.adapters.ValidationService;
import gameStore.business.abstracts.GamerService;
import gameStore.entities.concretes.Gamer;

public class GamerManager implements GamerService {

	private ValidationService validationService;

	public GamerManager(ValidationService validationService) {

		this.validationService = validationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (validationService.userValidation(gamer)) {
			System.out.println("Kay�t ba�ar�l�.");
		} else {
			System.out.println("B�yle bir kullan�c� olamaz.");
		}

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}