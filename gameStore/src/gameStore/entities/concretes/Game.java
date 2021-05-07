package gameStore.entities.concretes;

import gameStore.entities.abstracts.Entity;

public class Game implements Entity{
	
	private int id;
	private String gameName;
	private int price;
	
	public Game() {
		super();
	}
	
	public Game(int id, String gameName, int price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
