package com.hexaware.assignment2;

import java.util.Arrays;
//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner scn= new Scanner(System.in);
		Trainee trainee1= new Trainee(1, "Vikram", 8824494332L, "maskaleviki@gmail.com",
				"male", 23);
		
		Trainee trainee2= new Trainee(2, "Raj", 9876567893L, "raj@gmail.com",
				"male", 20);
		
		Trainee trainee3= new Trainee(3, "Rani", 9765678987L, "rajas@gmail.com",
				"female", 23);
		
		Batch batch=new Batch("B1", "17/09/2024", "17/09/2025", 
				new Trainee[] {trainee1, trainee2, trainee3});
		
		Trainee trainee=batch.getTrainee(2);
		System.out.println("Trainee with id-2 is "+trainee);
		
		Trainee[] maleTrainee= batch.getTrainee("male");
		System.out.println("male traines:");
		
		for(Trainee currTrainee:maleTrainee) {
			System.out.println(currTrainee);
		}
	}
}




