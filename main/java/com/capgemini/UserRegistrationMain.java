package com.capgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class UserRegistrationMain {
	Scanner sc = new Scanner(System.in);
	public boolean firstNameValidator(String firstName) throws UserRegistrationException {
		
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean matchFound = matcher.find();
		if(!matchFound)
			throw new UserRegistrationException ("Please check your input");
		return matchFound;
	}
	public boolean lastNameValidator(String lastName) throws UserRegistrationException{
		
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		Boolean matchFound = matcher.find();
		if(!matchFound)
			throw new UserRegistrationException ("Please check your input");
		
		return matchFound;
		
	}
	public boolean emailValidator(String email) throws UserRegistrationException{
		
		Pattern pattern = Pattern.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(email);
		Boolean matchFound = matcher.find();
		if(!matchFound)
			throw new UserRegistrationException ("Please check your input");
		return matchFound;
	}
	public boolean mobileValidator(String mobile) throws UserRegistrationException{
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobile);
		Boolean matchFound = matcher.find();
		if(!matchFound)
			throw new UserRegistrationException ("Please check your input");
		
		return matchFound;
		
	}
	public boolean passwordValidator(String password) throws UserRegistrationException{

		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
		Matcher matcher = pattern.matcher(password);
		Boolean matchFound = matcher.find();
		if(!matchFound)
			throw new UserRegistrationException ("Please check your input");
		return matchFound;
		
	}
 

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
	}

}