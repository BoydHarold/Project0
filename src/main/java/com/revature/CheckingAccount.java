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

public class CheckingAccount implements Account{
	private double balance;
	private String filePath = "C:\\Users\\boydt\\eclipse-workspace\\BankingApp\\PseudoDB\\PseudoTables\\Account\\Checking\\";
	File customerIdFile = new File(filePath + "CustomerId.txt");
	File customerCheckingAccountBalanceFile = new File(filePath + "CustomerCheckingAccountBalance.txt");
	File customerAccountStatusFile = new File(filePath + "CustomerAccountStatus.txt");
	
	@Override
	public void setupDefaultValues() {
		boolean exists = customerIdFile.exists();
		if(!exists) {
			try(
					FileOutputStream fosCustomerId = new FileOutputStream(customerIdFile, true);
					PrintStream psCustomerId = new PrintStream(fosCustomerId);
					
					FileOutputStream fosCustomerCheckingAccountBalance = new FileOutputStream(customerCheckingAccountBalanceFile, true);
					PrintStream psCustomerCheckingAccountBalance = new PrintStream(fosCustomerCheckingAccountBalance);
					
					FileOutputStream fosCustomerAccountStatus = new FileOutputStream(customerAccountStatusFile, true);
					PrintStream psCustomerAccountStatus = new PrintStream(fosCustomerAccountStatus);
					
			){
				psCustomerId.println("0");
				psCustomerCheckingAccountBalance.println("0");
				psCustomerAccountStatus.println("0");
				
			} catch (FileNotFoundException e) {
				
			} catch (IOException e) {
				
			}
		}
	}
	
	@Override
	public void withdrawl(int customerId, double amount) {
		double currentBalance = getBalance(customerId);
		double newBalance = currentBalance - amount;
		if(newBalance < 0) {
			System.out.println("You do not have enough money to withdrawl that much! You only have: " + currentBalance + " remaining in your account!");
		} else {
		System.out.println("New balance: " + newBalance);
		setBalance(customerId, newBalance);
		}
	}

	@Override
	public void deposit(int customerId, double amount) {
		
	}

	@Override
	public void transfer(int customerId, double amount, String source, String destination) {
		
	}

	@Override
	public void applyForAccount(int customerId) {
		
	}


	@Override
	public double getBalance(int customerId) {
		String balance = "0";
		try (
		FileInputStream fisGetBalance = new FileInputStream(customerCheckingAccountBalanceFile);
		BufferedReader brGetBalance = new BufferedReader(new InputStreamReader(fisGetBalance));
		) {
			String line = "";
			int lineNumber = 0;
			while(lineNumber <= customerId) {
				line = brGetBalance.readLine();
				balance = line;
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		return Double.parseDouble(balance);
	}

	@Override
	public void setBalance(int customerId, double balance) {
		ArrayList<String> alOne = new ArrayList<String>();
		ArrayList<String> alTwo = new ArrayList<String>();
		ArrayList<String> alThree = new ArrayList<String>();
		
		try (	
				FileInputStream fisGetBalance = new FileInputStream(customerCheckingAccountBalanceFile);
				BufferedReader brGetBalance = new BufferedReader(new InputStreamReader(fisGetBalance));
		) {
			String line = "";
			while((line = brGetBalance.readLine()) != null) {
				alOne.add(line);
			}
			
			for(int i = 0; i < alOne.size(); i++) {
				if(i < customerId) {
					alTwo.add(alOne.get(i));
				} else if (i > customerId){
					alThree.add(alOne.get(i));
				}
			}
			
			alOne.clear();
			alOne.addAll(alTwo);
			alOne.add(String.valueOf(balance));
			alOne.addAll(alThree);
				
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		
		customerCheckingAccountBalanceFile.delete();
		
		try(				
				FileOutputStream fosSetBalance = new FileOutputStream(customerCheckingAccountBalanceFile, true);
				PrintStream psSetBalance = new PrintStream(fosSetBalance);
			) {
			for(int i = 0; i < alOne.size(); i++) {
				psSetBalance.println(alOne.get(i));
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		
	}



}
