package com.niit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestJunit.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}  
/*Create a TestRunner java class.
Use runClasses method of JUnitCore class of JUnit to run the test case of the above created test class.
Get the result of test cases run in Result Object.
Get failure(s) using the getFailures() method of Result object.
Get Success result using the wasSuccessful() method of Result object.
*/