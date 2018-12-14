package com.revature;

import org.junit.Test;

public class RegistrationTest {
	@Test
	public void canInstantiate() {
		Registration registration = new Registration();
	}
	
	@Test
	public void aCustomerCanRegisterAUsernameAndPassword() {
		Registration registration = new Registration();
		registration.registerAccount();
	}
}
