package com.tdd.validators;

public class PasswordValidator {
	public boolean isValid(String password) {
		return 5 <= password.length() && password.length() <=10;
	}
}
