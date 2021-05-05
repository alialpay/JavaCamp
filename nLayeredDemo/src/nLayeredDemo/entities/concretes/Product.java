package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity{
	private int id;
	private int categortId;
	private String name;
	private double unitPrice;
	private int unitsInStock;
	
	public Product() {
		
	}

	public Product(int id, int categortId, String name, double unitPrice, int unitsInStock) {
		super();
		this.id = id;
		this.categortId = categortId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategortId() {
		return categortId;
	}

	public void setCategortId(int categortId) {
		this.categortId = categortId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
}
