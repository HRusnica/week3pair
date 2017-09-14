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
	public void testWithdrawOverdrawOne() {
		DollarAmount draftPick = sut.deposit(new DollarAmount(1000));
		draftPick =sut.withdraw(new DollarAmount(15000));
		assertEquals(new DollarAmount(1000), draftPick);
	}

	@Test
	public void testWithdrawNormal() {
		DollarAmount draftPick = sut.deposit(new DollarAmount(11000));
		draftPick = sut.withdraw(new DollarAmount(4000));
		assertEquals(new DollarAmount(7000), draftPick);
	}
	
	@Test
	public void testWithdrawOverdrawTwo() {
		DollarAmount draftPick = sut.deposit(new DollarAmount(5000));
		draftPick = sut.withdraw(new DollarAmount(20000));
		assertEquals(new DollarAmount(5000), draftPick);
	}
	
	@Test
	public void testWithdrawOverdraft() {
		DollarAmount draftPick = sut.deposit(new DollarAmount(10000));
		draftPick = sut.withdraw(new DollarAmount(15000));
		assertEquals(new DollarAmount(-6000), draftPick);
	}
}
