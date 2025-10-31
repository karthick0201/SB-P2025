package com.spring.pojo;


public class Food {
	
	private String foodName;
	private double price;
	private int id;
	
	public Food(String foodName, double price, int id) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", price=" + price + ", id=" + id + "]";
	}

	
	
	
	

}
