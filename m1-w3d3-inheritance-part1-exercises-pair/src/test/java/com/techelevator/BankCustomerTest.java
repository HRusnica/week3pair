package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {
	BankCustomer sut;
	BankCustomer sut2;
	BankCustomer sut3;
	BankCustomer sut4;
	
	@Before
	public void setUp() throws Exception {
		sut = new BankCustomer("Staci's Mom", "1111111 Street st.", "867-9305");
		CheckingAccount testAccount = new CheckingAccount();
		testAccount.deposit(new DollarAmount(2500000));
		sut.addAccount(testAccount);
	
		sut2 = new BankCustomer("Stevie", "448 Lost St.", "550-098-9989");
		SavingsAccount tester = new SavingsAccount();
		tester.deposit(new DollarAmount(1500000));
		sut2.addAccount(tester);
		CheckingAccount tester2 = new CheckingAccount();
		tester2.deposit(new DollarAmount(1500000));
		sut2.addAccount(tester2);
		
		sut3 = new BankCustomer("Jessies Girl", "321 Sesame St.", "555-555-5555");
		CheckingAccount test3 = new CheckingAccount();
		test3.deposit(new DollarAmount(10000));
		sut3.addAccount(test3);
		
		sut4 = new BankCustomer("Stevie", "448 Lost St.", "550-098-9989");
		SavingsAccount tester3 = new SavingsAccount();
		tester3.deposit(new DollarAmount(499900));
		sut4.addAccount(tester3);
		CheckingAccount tester4 = new CheckingAccount();
		tester4.deposit(new DollarAmount(2000000));
		sut4.addAccount(tester4);
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTrue() {
		 boolean result = sut.isVIP();
		 assertEquals(true, result);
	}

	
	@Test
	public void testFalse() {
		 boolean result = sut3.isVIP();
		 assertEquals(false, result);
	}

	@Test
	public void testMultipleAccts() {
		 boolean result = sut2.isVIP();
		 assertEquals(true, result);
	}
	
	@Test
	public void testMultipleAcctsFalse() {
		 boolean result = sut4.isVIP();
		 assertEquals(false, result);
	}
}
