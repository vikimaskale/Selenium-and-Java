package com.hexa.ioexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExcept {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("always exe");
		}
		System.out.println(s);
	}
}
