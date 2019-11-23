package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private static int id = 1;
	private String name;
	private int rating;
	private int truckid = 0;

	public int getTruckid() {
		return truckid;
	}

	public void setTruckid(int truckid) {
		this.truckid = truckid;
	}

	public FoodTruck(String name, int rating) {
		this.name = name;
		this.rating = rating;
		this.truckid = id;
		id++;
		

	}

	public FoodTruck() {

	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", rating=" + rating + "]";
	}

	public void setId(int id) {
		FoodTruck.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
