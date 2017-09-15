package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {
HourlyWorker sut;
	@Before
	public void setUp() throws Exception {
	sut = new HourlyWorker(15.95);
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ZeroPaytest() {
		int paystub = (int)sut.getCalculateWeeklyPay(0);
		assertEquals(0, paystub);
	}
	
	@Test
	public void Paytest40() {
		int paystub = (int)sut.getCalculateWeeklyPay(40);
		assertEquals(638, paystub);
	}
	
	@Test
	public void ZeroPaytest41() {
		int paystub = (int)sut.getCalculateWeeklyPay(41);
		assertEquals(661, paystub);
	}

}
