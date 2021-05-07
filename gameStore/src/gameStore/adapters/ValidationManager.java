package gameStore.adapters;

import gameStore.entities.concretes.Gamer;

public class ValidationManager implements ValidationService {

	@Override
	public boolean userValidation(Gamer gamer) {
		if(!gamer.getFirstName().isEmpty() && !(gamer.getDateOfBirth() >= 2003)
				  && gamer.getNationalityId().length() == 11 && !gamer.getLastName().isEmpty()) {
					System.out.println("Oyuncu sisteme kayit olmak icin gerekli kontrollerden gecirilmistir");
					return true;
					
				}
				System.out.println("Oyuncu kullanici dogrulama adimindan gecemedi !");
				return false;
	}

}