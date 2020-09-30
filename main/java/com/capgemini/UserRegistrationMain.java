package com.capgemini;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationMain {
	public void firstNameValidator(String firstName) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean matchFound = matcher.find();
        if(matchFound)
        	System.out.println("First Name is Validated");
        else
        	System.out.println("Please check your input");
        
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
        System.out.println("Enter your first name :");
        Scanner sc = new Scanner(System.in);
        UserRegistrationMain u = new UserRegistrationMain();
        u.firstNameValidator(sc.next());
	}

}
