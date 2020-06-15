package tests;

import org.testng.annotations.Test;

import pages.ProfilePage;

public class ProfileTest extends HomeTest{
  @Test(priority=2)
  public void profile() throws InterruptedException  {
	  ProfilePage ob2=new ProfilePage(driver);
			  ob2.profileDetails();
  }
}
