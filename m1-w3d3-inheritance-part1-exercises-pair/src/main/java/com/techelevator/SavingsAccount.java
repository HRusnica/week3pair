package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		if(amountToWithdraw.isGreaterThanOrEqualTo(getBalance()) || amountToWithdraw.isLessThanOrEqualTo(new DollarAmount(0))) {
			return getBalance();
		} else {
			 super.withdraw(amountToWithdraw);
			 if(getBalance().isLessThan(new DollarAmount(15000))){
			 super.withdraw(new DollarAmount(200));
			 }
			 return getBalance();
		}
	}
}
