package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest extends BankAccount {
CheckingAccount sut;
	@Before
	public void setUp() throws Exception {
		sut = new CheckingAccount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWithdrawOverdraft() {
		DollarAmount draftPick = sut.withdraw(new DollarAmount(15000));
		assertEquals(-10, draftPick);
	}

}
