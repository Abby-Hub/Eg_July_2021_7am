package com.oops;

import java.io.Serializable;

public class Bank implements Serializable{
	private int accNo;
	private String accName;
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
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public void withdraw(int amount){
		if(amount <= balance) {
		balance -= amount;
		System.out.println(amount +" Deducted. ");
		}
		else
			System.out.println("Transaction Diclained, No Funds...");
		
	}
	
	//public abstract void m1() ;
	
}
