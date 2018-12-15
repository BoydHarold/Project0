package com.revature;

public interface Account {
	public void setupDefaultValues();
	public void withdrawl(int customerId, double amount);
	public void deposit(int customerId, double amount);
	public void transfer(int customerId, double amount, String source, String destination);
	public void applyForAccount(int customerId);
	public double getBalance(int customerId);
	public void setBalance(int customerId, double balance);
}
