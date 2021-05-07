package gameStore.business.concretes;

import gameStore.business.abstracts.CampaignService;
import gameStore.entities.concretes.Campaign;
import gameStore.entities.concretes.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void add() {
		System.out.println("Kampanya olu�turuldu.");

	}

	@Override
	public void delete() {
		System.out.println("Kampanya silindi.");

	}

	@Override
	public void update() {
		System.out.println("Kampanya g�ncellendi.");

	}

}
