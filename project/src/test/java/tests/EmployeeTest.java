package tests;

import org.testng.annotations.Test;

import pages.EmployeePage;

public class EmployeeTest extends JobTest {
		  @Test(priority=4)
	  public void deduct() throws InterruptedException {
		  EmployeePage ob5=new EmployeePage(driver);
		  ob5.createDeduction(); 
		  
	  }
	}


