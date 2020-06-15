package tests;


import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.Base;

public class LoginTest extends Base{
	 @Test(priority=0)
	  public void Login() throws InterruptedException {
		  LoginPage ob =new LoginPage(driver);
		  ob.loginDetails();
		  
	  }
	}
