package com.techelevator;

public abstract class BankAccount {

	private String accountNumber;
	private DollarAmount balance = new DollarAmount(0);
	
	
	public DollarAmount deposit(DollarAmount amountToDeposit){
		if(amountToDeposit.isGreaterThan(new DollarAmount(0))) {
		balance = balance.plus(amountToDeposit);
		}
		return balance;
	}
	
	public DollarAmount withdraw(DollarAmount amountToWithdraw){
		if(amountToWithdraw.isGreaterThan(new DollarAmount(0))) {
		balance = balance.minus(amountToWithdraw);
		}
		return balance;
	}
	
	public DollarAmount accountBalance(String accountNumber){
		return getBalance();
	}
	
	public void transfer(BankAccount destinationAccount, DollarAmount transferAmount){
		this.withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public DollarAmount getBalance() {
		return balance;
	}
}
	

