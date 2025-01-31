//Assignment 2
package javaAssignment1;

import java.util.Scanner;

public class MenuSelection {
	
	public static void displayManu() {
		System.out.println("Menu: ");
		System.out.println("1. Samosa - Rs. 20");
		System.out.println("2. Kheer - Rs.30");
		System.out.println("3. French Fries - Rs. 70");
		System.out.println("4. Vegetable soup - Rs. 50");
		System.out.println("5. Veg thali - Rs. 80");
		System.out.println("6. Panir thali- Rs. 120");
		System.out.println("7. Display Menu");
		System.out.println("8. Exit");
	}
	
	public static int CalculateTotalCost() {
		Scanner scn=new Scanner(System.in);
		int totalCost=0, choice;
		do {
			System.out.println("Please enter your choice number: ");
			choice = scn.nextInt();
			
			switch(choice) {
			case 1:
				totalCost+=20;
				System.out.println("Samosa added");
				break;
			
			case 2:
				totalCost+=30;
				System.out.println("Kheer added");
				break;
				
			case 3:
				totalCost+=70;
				System.out.println("French Fries added");
				break;
				
			case 4:
				totalCost+=50;
				System.out.println("Vegetable soup added");
				break;
				
			case 5:
				totalCost+=80;
				System.out.println("Veg thali added");
				break;
				
			case 6:
				totalCost+=120;
				System.out.println("Panir thali added");
				
			case 7:
				displayManu();
				break;
				
			case 8:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Invalid choice. Please enter valid number");
				
			}
		}while(choice!=8);
		
		return totalCost;
	}

	public static void main(String[] args) {
		displayManu();
		int totalCost= CalculateTotalCost();
		System.out.println("Total Cost: "+ totalCost);

	}

}
