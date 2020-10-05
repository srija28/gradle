package com.capgemini;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.firstNameValidator.validate("Shreya");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenFirstName_Improper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.firstNameValidator.validate("shreya");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenLastName_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.lastNameValidator.validate("Reddy");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenLastName_Improper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.lastNameValidator.validate("reddy");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }
	}

	@Test
	public void givenEmail_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.emailValidator.validate("shreya.reddy@yahoo.co.in");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenEmail_Imroper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.emailValidator.validate("fffhhhh");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenPassword_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.passwordValidator.validate("Shreya@57");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenPassword_Imroper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.passwordValidator.validate("fff");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenMobileNo_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.mobileValidator.validate("91 9100887766");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}

	@Test
	public void givenMobileNo_Improper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();
		try {
		boolean result = user.mobileValidator.validate("5757");
		Assert.assertTrue(true);
		}catch(UserRegistrationException e) {
        	Assert.assertEquals("Please check your input", e.getMessage());
        }

	}
}