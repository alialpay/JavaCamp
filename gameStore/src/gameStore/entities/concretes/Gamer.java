package gameStore.entities.concretes;

import gameStore.entities.abstracts.Entity;

public class Gamer implements Entity{
	
	private int id; 
	private String nationalityId;
	private int dateOfBirth;
	private String firstName;
	private String lastName;
	private String nickName;
	private String email;
	private double wallet;
	
	public Gamer() {
		super();
	}


	public Gamer(int id, String nationalityId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getWallet() {
		return wallet;
	}


	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	
	
}
