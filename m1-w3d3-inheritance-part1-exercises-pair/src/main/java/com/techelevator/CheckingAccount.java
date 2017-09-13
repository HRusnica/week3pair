package com.techelevator;

public class CheckingAccount extends BankAccount{

	@Override
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		super.withdraw(amountToWithdraw);
//		if(getBalance().isLessThanOrEqualTo(new DollarAmount(-10000))) {
//			return getBalance();
		 if(getBalance().isLessThan(new DollarAmount(0))){
			super.withdraw(new DollarAmount(1000));
		 }
			return getBalance();
//		} else {
//			return getBalance();
//	}

	}
}


