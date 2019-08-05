package com.niit.test;

import org.junit.Test;

import com.niit.code.MessageUtil;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   /*
    * JUnit provides a handy option of Timeout.
    *  If a test case takes more time than the specified number of milliseconds, 
    *  then JUnit will automatically mark it as failed.
    *   The timeout parameter is used along with @Test annotation.
    *    Let us see the @Test(timeout) in action.
    */
   @Test(timeout = 1000)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}