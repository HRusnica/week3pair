package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount sut;
	@Before
	public void setUp() throws Exception {
		sut = new BankAccount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDepositNorm() {
		DollarAmount result = sut.deposit(new DollarAmount(1234));
		assertEquals("$12.34", result.toString());	
	}
	
	@Test
	public void testDepositZero() {
		DollarAmount result = sut.deposit(new DollarAmount(0));
		assertEquals("$0.00", result.toString());	
	}
	
	@Test
	public void testDepositNeg() {
		DollarAmount result = sut.deposit(new DollarAmount(-1234));
		assertEquals("-$12.34", result.toString());	
	}

	
	
}
