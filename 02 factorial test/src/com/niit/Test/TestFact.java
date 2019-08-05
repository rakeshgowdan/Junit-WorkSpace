package com.niit.Test;

import org.junit.Test;

import com.niit.Fact.FactorialExample;

import static org.junit.Assert.assertEquals;
public class TestFact {
	
	int expResult=120;
	
	@Test
	public void testFactorial() {
		assertEquals(expResult,FactorialExample.factorial(5));
	}

}
