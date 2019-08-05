package com.niit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.niit.code.Add;

public class TestAdd {

	@Test
	public void testadd() {
		
		
		assertEquals(10,Add.add(4, 6));
		
	}

	@Test
	public void testadd1() {
		
		
	
		assertEquals(21,Add.add(10, 11));
	
	}
	
	@Test
	public void testadd2() {
		
		
		
	assertEquals(5,Add.add(0,0));
	}
	
}
