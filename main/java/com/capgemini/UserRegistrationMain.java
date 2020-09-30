package com.capgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class UserRegistrationMain {
	Scanner sc = new Scanner(System.in);
	public void firstNameValidator() {
		System.out.println("Enter your first name");
		String firstName = sc.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("First Name is Validated");
		} else {
			System.out.println("Please check your input");
		}
	}
	public void lastNameValidator() {
		System.out.println("Enter your last name");
		String lastName = sc.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		Boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Last Name is Validated");
		} else {
			System.out.println("Please check your input");
		}
	}
	public void emailValidator() {
		System.out.println("Enter your email");
		String email = sc.next();
		Pattern pattern = Pattern.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(email);
		Boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Email is Validated");
		} else {
			System.out.println("Please check your input");
		}
	}
	public void mobileValidator() {
		System.out.println("Enter your mobile number");
		String mobile = sc.next();
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobile);
		Boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Mobile Number is Validated");
		} else {
			System.out.println("Please check your input");
		}
	}
	public void passwordValidator() {
		System.out.println("Enter your password");
		String password = sc.next();
		Pattern pattern = Pattern.compile("^.*[A-Z]+(\\S){7,}$");
		Matcher matcher = pattern.matcher(password);
		Boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Password is Validated");
		} else {
			System.out.println("Please check your input");
		}
		
	}
 

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
		
		UserRegistrationMain u = new UserRegistrationMain();
		u.firstNameValidator();
		u.lastNameValidator();
		u.emailValidator();
		u.mobileValidator();
		u.passwordValidator();

	}

}