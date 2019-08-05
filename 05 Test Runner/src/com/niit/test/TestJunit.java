package com.niit.test;

import org.junit.Test;

import com.niit.code.MessageUtil;

import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}

/*
Create a java test class, say, TestJunit.java.
Add a test method testPrintMessage() to your test class.
Add an Annotaion @Test to method testPrintMessage().
Implement the test condition and check the condition using assertEquals API of JUnit.
*/