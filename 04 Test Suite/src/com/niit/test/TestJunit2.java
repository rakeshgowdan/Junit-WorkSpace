package com.niit.test;

import org.junit.Test;

import com.niit.code.MessageUtil;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {

   String message = "Ram";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Ram";
      assertEquals(message,messageUtil.salutationMessage());
   }
}