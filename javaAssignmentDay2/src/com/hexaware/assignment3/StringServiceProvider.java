package com.hexaware.assignment3;

public class StringServiceProvider {
	public static String reverseString(String string) {
		StringBuilder reverseString=new StringBuilder(string);
		int i=0, j=string.length()-1;
		while(i<j) {
			char tempChar=string.charAt(i);
			reverseString.setCharAt(i, string.charAt(j));
			reverseString.setCharAt(j, tempChar);
			i++;
			j--;
		}
		return reverseString.toString();
	}
	
	public static int LinerSearch(char char1, String string) {
		int index=-1;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==char1) index=i;
		}
		return index;
	}
	
	public static String replaceChar(int index, char char1, String string) {
		if(index>=string.length())return "index out of bound";
		StringBuilder newString= new StringBuilder(string);
		newString.setCharAt(index, char1);
		return newString.toString();
	}
	
	//non-static methods
	public String reverseString1(String string) {
		StringBuilder reverseString=new StringBuilder(string);
		int i=0, j=string.length()-1;
		while(i<j) {
			char tempChar=string.charAt(i);
			reverseString.setCharAt(i, string.charAt(j));
			reverseString.setCharAt(j, tempChar);
			i++;
			j--;
		}
		return reverseString.toString();
	}
	
	public int LinerSearch1(char char1, String string) {
		int index=-1;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==char1) index=i;
		}
		return index;
	}
	
	public String replaceChar1(int index, char char1, String string) {
		if(index>=string.length())return "index out of bound";
		StringBuilder newString= new StringBuilder(string);
		newString.setCharAt(index, char1);
		return newString.toString();
	}
	
}





