package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DollarAmountTest {

	DollarAmount sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DollarAmount(2, 35);
	}

	
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		//Act
		String testString = sut.toString();
		
		//Assert
		assertEquals("$2.35", testString);
		
	}

}
