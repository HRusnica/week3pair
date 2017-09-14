package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {

	SavingsAccount sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SavingsAccount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWithdrawNeg() {
		DollarAmount result = sut.withdraw(new DollarAmount(-1234));
		assertEquals(new DollarAmount(0), result);	
	}
	
	@Test
	public void testWithdrawZero() {
		DollarAmount result = sut.withdraw(new DollarAmount(0));
		assertEquals(new DollarAmount(0), result);	
	}
	
	@Test
	public void testWithdrawPositive() {
		DollarAmount result = sut.withdraw(new DollarAmount(1234));
		assertEquals(new DollarAmount(0), result);	
	}

	@Test
	public void testWithdrawPositiveWithDeposit() {
		sut.deposit(new DollarAmount(20000));
		DollarAmount result = sut.withdraw(new DollarAmount(1000));
		assertEquals(new DollarAmount(19000), result);	
	}
	
	@Test
	public void testWithdrawFrom140() {
		sut.deposit(new DollarAmount(14000));
		DollarAmount result = sut.withdraw(new DollarAmount(5000));
		assertEquals(new DollarAmount(8800), result);	
	}

}
