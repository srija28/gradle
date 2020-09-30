package com.capgemini;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();
		boolean result = user.firstNameValidator("Shreya");
		Assert.assertTrue(true);

	}

	@Test
	public void givenFirstName_Improper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();
		boolean result = user.firstNameValidator("shreya");
		Assert.assertTrue(true);

	}

	@Test
	public void givenLastName_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();
		boolean result = user.lastNameValidator("Reddy");
		Assert.assertTrue(true);

	}

	@Test
	public void givenLastName_Improper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();

		boolean result = user.lastNameValidator("reddy");
		Assert.assertTrue(true);

	}

	@Test
	public void givenEmail_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();

		boolean result = user.emailValidator("shreya.reddy@yahoo.co.in");
		Assert.assertTrue(true);

	}

	@Test
	public void givenEmail_Imroper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();

		boolean result = user.emailValidator("fffhhhh");
		Assert.assertTrue(true);

	}

	@Test
	public void givenPassword_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();

		boolean result = user.passwordValidator("Shreya@57");
		Assert.assertTrue(true);

	}

	@Test
	public void givenPassword_Imroper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();

		boolean result = user.passwordValidator("fff");
		Assert.assertTrue(true);

	}

	@Test
	public void givenMobileNo_Proper_ReturnTrue() {
		UserRegistrationMain user = new UserRegistrationMain();

		boolean result = user.mobileValidator("91 9100887766");
		Assert.assertTrue(true);

	}

	@Test
	public void givenMobileNo_Improper_ReturnFalse() {
		UserRegistrationMain user = new UserRegistrationMain();

		boolean result = user.mobileValidator("5757");
		Assert.assertTrue(true);

	}
}