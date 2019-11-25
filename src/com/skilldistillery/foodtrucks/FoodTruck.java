package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private static int id = 1;
	private String name;
	private int rating;
	private int truckid = 0;
	private String foodType;

	public FoodTruck(String name, int rating,String foodType) {
		this.name = name;
		this.rating = rating;
		this.truckid = id;
		this.foodType = foodType;
		id++;

	}

	public FoodTruck() {

	}

	public int getTruckid() {
		return truckid;
	}

	public void setTruckid(int truckid) {
		this.truckid = truckid;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", rating=" + rating + ", truckid=" + truckid + ", foodType=" + foodType
				+ "]";
	}

	public String getFoodType() {
		return this.foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public void setId(int id) {
		FoodTruck.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
