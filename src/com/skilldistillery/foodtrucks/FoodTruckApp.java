package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner input = new Scanner(System.in);
		String userInput = "";
		FoodTruck[] truckArr = new FoodTruck[5];

		int rating = 0;
		int count = 0;
		while (!userInput.equals("quit") && !(count >= 5)) {
			System.out.println("Please input truck name");
			userInput = input.next();
			if (userInput.equalsIgnoreCase("quit") && count == 0) {
				System.out.println("Goodbye");
				continue;
			} else if (userInput.equalsIgnoreCase("quit")) {
				continue;
			}
			System.out.println("Now enter the trucks rating");
			rating = input.nextInt();
			truckArr[count] = new FoodTruck(userInput, rating);

			count++;
		}
		while (true) {
			System.out.println("Please select an option");
			System.out.println("# 1: List all existing food trucks");
			System.out.println("# 2: See the average rating of food trucks");
			System.out.println("# 3: Display the highest-rated food truck");
			System.out.println("# 4: Quit the program");
			int choice = input.nextInt();
			switch (choice) {
				case 1:
					listTrucks(truckArr);
					continue;
				case 2:
					System.out.println(getAverageRating(truckArr));
					continue;
				case 3:
					System.out.println(bestRating(truckArr));
					continue;
				case 4:
					break;
				case 5:
					for (FoodTruck foodTruck : truckArr) {
						if(foodTruck != null) {
							System.out.println(foodTruck.getTruckid());
						}
						
					}
			}
			break;
		}
		input.close();

	}

	public double getAverageRating(FoodTruck[] truckArr) {
		double avg = 0;
		int count = 0;
		for (FoodTruck foodTruck : truckArr) {
			if (foodTruck != null) {
				count++;
				avg += foodTruck.getRating();
			}

		}
		return avg / count;

	}

	public void listTrucks(FoodTruck[] truckArr) {
		for (FoodTruck foodTruck : truckArr) {
			if (foodTruck != null) {
				System.out.println(foodTruck.toString());
			}
		}

	}

	public String bestRating(FoodTruck[] truckArr) {
		int biggest = truckArr[0].getRating();
		String result = "";
		for (int i = 0; i < truckArr.length; i++) {
			if (truckArr[i] != null && truckArr[i].getRating() >= biggest) {
				result = truckArr[i].toString();
			}
		}
		return result;

	}
}