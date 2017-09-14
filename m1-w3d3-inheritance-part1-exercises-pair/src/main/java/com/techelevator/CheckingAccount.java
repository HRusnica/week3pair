package com.techelevator;

public class CheckingAccount extends BankAccount{

	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		if(super.withdraw(amountToWithdraw).isLessThanOrEqualTo(new DollarAmount(-10000))) {
		DollarAmount amountToDeposit =  amountToWithdraw;
			super.deposit(amountToDeposit);
			return getBalance();
		} else {
		 if(getBalance().isLessThan(new DollarAmount(0))){
			super.withdraw(new DollarAmount(1000));
			return getBalance();}
		return getBalance();
	}
		

//	@Override
//	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
//		if(super.withdraw(amountToWithdraw).isLessThan(new DollarAmount(-10000))){
//			return getBalance();
//		} else if(super.withdraw(amountToWithdraw).isLessThan(new DollarAmount(0))){
//			super.withdraw(amountToWithdraw.plus(new DollarAmount(1000)));
//			return getBalance();
//		} super.withdraw(amountToWithdraw);
//		return getBalance();	
//		}
			
		}}	



