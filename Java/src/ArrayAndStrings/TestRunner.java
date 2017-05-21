package ArrayAndStrings;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;


public class TestRunner {
	   public void main(String[] args) {
	      Result result = JUnitCore.runClasses(UnitTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
	}  	
