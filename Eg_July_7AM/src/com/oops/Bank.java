package com.oops;

public class Bank {
	public int accNo;
	public String accName;
	private float balance;
	
	public Bank(int accNo, String accName, float balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = this.balance + balance;
	}
	
	public void withdraw(int amount){
		if(amount <= balance) {
		balance -= amount;
		System.out.println(amount +" Deducted. ");
		}
		else
			System.out.println("Transaction Diclained, No Funds...");
		
	}
	
}
