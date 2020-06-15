package tests;

import org.testng.annotations.Test;

import pages.HomePage;


public class HomeTest extends LoginTest{
  @Test(priority=1)
  public void Home() throws InterruptedException {
	   HomePage ob1=new HomePage(driver);
	   ob1.HomeClick();
	  
  }
}

