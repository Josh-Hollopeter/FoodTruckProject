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
		int numTrucksInputCount = 0;
		while (!userInput.equals("quit") && !(numTrucksInputCount >= 5)) {
			System.out.println("Please input truck name");
			userInput = input.nextLine();
			
			if (userInput.equalsIgnoreCase("quit") && numTrucksInputCount == 0) {
				System.out.println(" You've entered 0 trucks: Goodbye");
				continue;
			} else if (userInput.equalsIgnoreCase("quit")) {
				continue;
			}
			System.out.println("Now enter the trucks rating between 1-5:");
			rating = input.nextInt();
			if(rating > 5) {
				rating = 5;
			}
			else if(rating < 0) {
				rating = 0;
			}
			input.nextLine();
			truckArr[numTrucksInputCount] = new FoodTruck(userInput, rating);

			numTrucksInputCount++;
		}
		while (true && numTrucksInputCount > 0) {
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
					System.out.println(bestRating(truckArr).toString());
					continue;
				case 4:
					System.out.println("Have a good day ... exiting program");
					break;
				default:
					continue;
			}
			break;
		}
		input.close();

	}

	public String getAverageRating(FoodTruck[] truckArr) {
		double avg = 0;
		int count = 0;
		for (FoodTruck foodTruck : truckArr) {
			if (foodTruck != null) {
				count++;
				avg += foodTruck.getRating();
			}

		}
		return "The average rating is: " + avg / count;

	}

	public void listTrucks(FoodTruck[] truckArr) {
		for (FoodTruck foodTruck : truckArr) {
			if (foodTruck != null) {
				System.out.println(foodTruck.toString());
			}
		}

	}

	public FoodTruck bestRating(FoodTruck[] truckArr) {
		int biggest = truckArr[0].getRating();
		FoodTruck result = truckArr[0];
		for (int i = 1; i < truckArr.length; i++) {
			if (truckArr[i] != null && truckArr[i].getRating() > biggest) {
				result = truckArr[i];
				biggest = truckArr[i].getRating();
			}
		}
		return result;

	}
}