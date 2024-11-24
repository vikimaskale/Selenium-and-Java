//Assignment 9
package javaAssignment1;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your weight (in Kg):");
		float weight= scn.nextFloat();
		System.out.println("Enter your height (in meters):");
		float height= scn.nextFloat();
		float bmi= calculateBmi(weight, height);
		System.out.println("Your Body Mass Index is: "+ String.format("%.2f", bmi));
		
		String bmiCategory= findBmiCategory(bmi);
		System.out.println("You are categorized as: "+ bmiCategory);
	}
	
	public static float calculateBmi(float weight, float height) {
		return weight / (height * height);
	}
	
	public static String findBmiCategory(float bmi) {
		if(bmi < 18.5)return "Underwight";
		else if(bmi >= 18.5 && bmi<=24.9) return "Normal Weight";
		else if(bmi>24.9 && bmi<30) return "Overweight";
		else return "Obese";
	}

}
