package com.hexa.filenotfound;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundSample {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner obj=new Scanner(new File("note.txt"));
		while(obj.hasNextLine()) {
			String line =obj.nextLine();
			System.out.println(line);
		}
	}
}
