package com.niit.test;

import org.junit.Test;

import com.niit.code.MessageUtil;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {

   String message = "Ram";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}