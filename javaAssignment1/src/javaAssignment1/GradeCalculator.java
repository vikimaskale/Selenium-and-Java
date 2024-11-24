//Assignment 1
package javaAssignment1;

import java.util.Scanner;

public class GradeCalculator {
	
	public static char calculateGrage(float avgScore) {
		if(avgScore >= 90) {
			return 'A';
		}else if(avgScore >= 80) {
			return 'B';
		}else if(avgScore >=70) {
			return 'C';
		}else if(avgScore >= 60) {
			return 'D';
		}else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Math Score:");
		int mathScore= scn.nextInt();
		
		System.out.println("Enter Science Score:");
		int scienceScore= scn.nextInt();
		
		System.out.println("Enter English Score:");
		int englishScore= scn.nextInt();
		
		float avgScore= (float)(mathScore + scienceScore + englishScore)/3;
		char grade= calculateGrage(avgScore);
		System.out.println("Your grade is: " + grade);
	}

}







