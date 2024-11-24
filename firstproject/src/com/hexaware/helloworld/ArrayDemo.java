package com.hexaware.helloworld;
// ctrl+shft+f formating
//ctrl + f11 run

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		int[] numbers= new int[5];
		Scanner scanner= new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			numbers[i]=scanner.nextInt();
		}
		
		
		System.out.println("using for each loop");
		printUsingForEach(numbers);
		
		System.out.println("using for loop");
		printUsingFor(numbers);
		
		System.out.println("using Arrays.toString");
		printUsingArraysToString(numbers);
		
		//create even number array
		int []evenNumArray= createEvenNumberArray(numbers);
		
		System.out.println("Even Number Array:");
		printUsingArraysToString(evenNumArray);
		
		
		
	}
	
	public static void printUsingForEach(int[] numbers) {
		for(int number:numbers) {
			System.out.print(number+ " ");
		}
		System.out.println();
	}
	
	public static void printUsingFor(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	public static void printUsingArraysToString(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}
	
	public static int[] createEvenNumberArray(int[] numbers) {
		int[] evenArray= new int[numbers.length];
		int index=0;
		for(int number: numbers) {
			if(number%2==0) {
				evenArray[index++]=number;
			}
		}
		
		int[] ansArray = new int[index];
		int indexOfAns=0;
		for(int i=0;i<index;i++) {
			ansArray[indexOfAns++]=evenArray[i];
		}
		return ansArray;
	}
}
