package com.hexaware.helloworld;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[][] jaggedArray=new int[5][];
		
//		for(int i=0;i<jaggedArray.length;i++) {
//			jaggedArray[i]=new int[i+1];
//		}
		
		int count=0;
		for(int i=0; i<jaggedArray.length;i++) {
			jaggedArray[i]=new int[i+1];
			for(int j=0;j<jaggedArray[i].length;j++) {
				jaggedArray[i][j]=count++;
			}
		}
		
		//printing jaggedArray
		for(int i=0; i<jaggedArray.length;i++) {
			for(int j=0;j<jaggedArray[i].length;j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
