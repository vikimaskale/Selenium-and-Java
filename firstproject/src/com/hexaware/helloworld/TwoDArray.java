package com.hexaware.helloworld;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[][] numbers= new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				numbers[i][j]=scn.nextInt();
			}
		}
		
		//printing numbers
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}

	}

}




