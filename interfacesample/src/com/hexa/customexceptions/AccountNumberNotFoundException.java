package com.hexa.customexceptions;

public class AccountNumberNotFoundException extends Exception{
	private String message;

	public AccountNumberNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "AccountNumberNotFoundException [message=" + message + "]";
	}
	
}

