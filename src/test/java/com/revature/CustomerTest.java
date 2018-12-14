package com.revature;

import java.util.Scanner;

import org.junit.Test;

public class CustomerTest {
	@Test
	public void canInstantiate() {
		Customer customer = new Customer();
	}
	
	@Test
	public void aCustomersBasicInformationCanBeStoredInTheSytemWithoutCommit() {
		Customer customer = new Customer();
		customer.setCustomerFirstName("John");
		customer.setCustomerLastName("Smith");
		customer.setCustomerAddress("123 Wallaby Way");
		customer.setCustomerBirthDate(01,01,1980);
		customer.setCustomerEmailAddress("John.Smith@revature.com");
		customer.setCustomerPhoneNumber("303-000-0000");
		customer.setCustomerId();
	}
	
	@Test
	public void aCustomersBasicInformationCanBeRetrievedFromTheSystemWithoutCommit() {
		Customer customer = new Customer();
		int customerId;
		customerId = 1;
		customer.getCustomerFirstName(customerId);
		customer.getCustomerLastName(customerId);
		customer.getCustomerAddress(customerId);
		customer.getCustomerBirthDate(customerId);
		customer.getCustomerEmailAddress(customerId);
		customer.getCustomerPhoneNumber(customerId);
	}
	
	@Test
	public void aCustomersBasicInformationCanBeStoredInTheSytemWithCommit() {
		Customer customer = new Customer();
		customer.setCustomerFirstName("John");
		customer.setCustomerLastName("Smith");
		customer.setCustomerAddress("123 Wallaby Way");
		customer.setCustomerBirthDate(01,01,1980);
		customer.setCustomerEmailAddress("John.Smith@revature.com");
		customer.setCustomerPhoneNumber("303-000-0000");
		customer.setCustomerId();
		customer.commitCustomer();
	}
	
	@Test
	public void aCustomersBasicInformationCanBeRetrievedFromTheSystemWithCommit() {
		Customer customer = new Customer();
		int customerId;
		customerId = 1;
		customer.getCommittedCustomerInformation(customerId);
		customer.getCustomerFirstName(customerId);
		customer.getCustomerLastName(customerId);
		customer.getCustomerAddress(customerId);
		customer.getCustomerBirthDate(customerId);
		customer.getCustomerEmailAddress(customerId);
		customer.getCustomerPhoneNumber(customerId);
	}
}
