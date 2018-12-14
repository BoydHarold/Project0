package com.revature;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		Customer customer = new Customer();

//		customer.setCustomerFirstName("Tom");
//		customer.setCustomerLastName("Skirk");
//		customer.setCustomerAddress("423 Nine Oh St");
//		customer.setCustomerBirthDate(01,01,1987);
//		customer.setCustomerEmailAddress("Tom.Skirk@revature.com");
//		customer.setCustomerPhoneNumber("303-000-0002");
//		customer.setCustomerId();
//		customer.commitCustomer();
		
		int customerId = 1;
		customer.getCommittedCustomerInformation(customerId);

		System.out.println(customer.getCustomerFirstName(customerId));
		System.out.println(customer.getCustomerLastName(customerId));
		System.out.println(customer.getCustomerAddress(customerId));
		System.out.println(customer.getCustomerBirthDate(customerId));
		System.out.println(customer.getCustomerEmailAddress(customerId));
		System.out.println(customer.getCustomerPhoneNumber(customerId));

		
        

    }
}
