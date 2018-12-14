package com.revature;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Customer {
	private String firstName;
	private String lastName;
	private String address;
	private String birthDate;
	private String emailAddress;
	private String phoneNumber;
	private int customerId;

	public void setCustomerFirstName(String name) {
		this.firstName = name;
	}

	public void setCustomerLastName(String name) {
		this.lastName = name;
	}

	public void setCustomerAddress(String address) {
		this.address = address;
	}

	public void setCustomerBirthDate(int day, int month, int year) {
		String birthDate = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
		this.birthDate = birthDate;
	}

	public void setCustomerEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setCustomerPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCustomerId() {
		this.customerId = 3;
	}

	public String getCustomerFirstName(int customerId) {
		return this.firstName;
	}

	public String getCustomerLastName(int customerId) {
		return this.lastName;
	}

	public String getCustomerAddress(int customerId) {
		return this.address;
	}

	public String getCustomerBirthDate(int customerId) {
		return this.birthDate;
	}

	public String getCustomerEmailAddress(int customerId) {
		return this.emailAddress;
	}

	public String getCustomerPhoneNumber(int customerId) {
		return this.phoneNumber;
	}

	public void commitCustomer() {
		File customerIdFile = new File("CustomerId.txt");
		File customerFirstNameFile = new File("CustomerFirstName.txt");
		File customerLastNameFile = new File("CustomerLastName.txt");
		File customerAddressFile = new File("CustomerAddress.txt");
		File customerBirthDateFile = new File("CustomerBirthDate.txt");
		File customerEmailAddressFile = new File("CustomerEmailAddress.txt");
		File customerPhoneNumberFile = new File("CustomerPhoneNumber.txt");
		try (
				FileOutputStream fosCustomerId = new FileOutputStream(customerIdFile, true);
				PrintStream psCustomerId = new PrintStream(fosCustomerId);

				FileOutputStream fosCustomerFirstName = new FileOutputStream(customerFirstNameFile, true);
				PrintStream psCustomerFirstName = new PrintStream(fosCustomerFirstName);
				
				FileOutputStream fosCustomerLastName = new FileOutputStream(customerLastNameFile, true);
				PrintStream psCustomerLastName = new PrintStream(fosCustomerLastName);
				
				FileOutputStream fosCustomerAddress = new FileOutputStream(customerAddressFile, true);
				PrintStream psCustomerAddress = new PrintStream(fosCustomerAddress);
				
				FileOutputStream fosCustomerBirthDate = new FileOutputStream(customerBirthDateFile, true);
				PrintStream psCustomerBirthDate = new PrintStream(fosCustomerBirthDate);
				
				FileOutputStream fosCustomerEmailAddress = new FileOutputStream(customerEmailAddressFile, true);
				PrintStream psCustomerEmailAddress = new PrintStream(fosCustomerEmailAddress);
				
				FileOutputStream fosCustomerPhoneNumber = new FileOutputStream(customerPhoneNumberFile, true);
				PrintStream psCustomerPhoneNumber = new PrintStream(fosCustomerPhoneNumber);) {
			
			psCustomerId.println(String.valueOf(customerId));
			psCustomerFirstName.println(firstName);
			psCustomerLastName.println(lastName);
			psCustomerAddress.println(address);
			psCustomerBirthDate.println(birthDate);
			psCustomerEmailAddress.println(emailAddress);
			psCustomerPhoneNumber.println(phoneNumber);

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public void getCommittedCustomerInformation(int customerId) {
		File customerFirstNameFile = new File("CustomerFirstName.txt");
		File customerLastNameFile = new File("CustomerLastName.txt");
		File customerAddressFile = new File("CustomerAddress.txt");
		File customerBirthDateFile = new File("CustomerBirthDate.txt");
		File customerEmailAddressFile = new File("CustomerEmailAddress.txt");
		File customerPhoneNumberFile = new File("CustomerPhoneNumber.txt");
		
		this.customerId = customerId;
		
		int index = customerId - 1;
		
		try (
				
            	FileInputStream fisCustomerFirstName = new FileInputStream(customerFirstNameFile);
				BufferedReader brCustomerFirstName = new BufferedReader(new InputStreamReader(fisCustomerFirstName));
				
            	FileInputStream fisCustomerLastName = new FileInputStream(customerLastNameFile);
				BufferedReader brCustomerLastName = new BufferedReader(new InputStreamReader(fisCustomerLastName));
				
            	FileInputStream fisCustomerAddress = new FileInputStream(customerAddressFile);
				BufferedReader brCustomerAddress = new BufferedReader(new InputStreamReader(fisCustomerAddress));
				
            	FileInputStream fisCustomerBirthDate = new FileInputStream(customerBirthDateFile);
				BufferedReader brCustomerBirthDate = new BufferedReader(new InputStreamReader(fisCustomerBirthDate));
				
            	FileInputStream fisCustomerEmailAddress = new FileInputStream(customerEmailAddressFile);
				BufferedReader brCustomerEmailAddress = new BufferedReader(new InputStreamReader(fisCustomerEmailAddress));
				
            	FileInputStream fisCustomerPhoneNumber = new FileInputStream(customerPhoneNumberFile);
				BufferedReader brCustomerPhoneNumber = new BufferedReader(new InputStreamReader(fisCustomerPhoneNumber));
			){
			
			ArrayList<String> list = new ArrayList<>();
            String line = brCustomerFirstName.readLine();
            while(line != null){
            	list.add(line);
                line = brCustomerFirstName.readLine();
            }  
            
            this.firstName = list.get(index);
            
            line = brCustomerLastName.readLine();
        	list.clear();
            while(line != null){
            	list.add(line);
                line = brCustomerLastName.readLine();
            }  
            
            this.lastName = list.get(index);
            
            line = brCustomerAddress.readLine();
        	list.clear();
            while(line != null){
            	list.add(line);
                line = brCustomerAddress.readLine();
            }  
            
            this.address = list.get(index);
            
            line = brCustomerBirthDate.readLine();
        	list.clear();
            while(line != null){
            	list.add(line);
                line = brCustomerBirthDate.readLine();
            }  
            
            this.birthDate = list.get(index);
            
            line = brCustomerEmailAddress.readLine();
        	list.clear();
            while(line != null){
            	list.add(line);
                line = brCustomerEmailAddress.readLine();
            }  
            
            this.emailAddress = list.get(index);
            
            line = brCustomerPhoneNumber.readLine();
        	list.clear();
            while(line != null){
            	list.add(line);
                line = brCustomerPhoneNumber.readLine();
            }  
            
            this.phoneNumber = list.get(index);
            	
    		} catch (FileNotFoundException e) {

    		} catch (IOException e) {
    			
    		}
	}

}
