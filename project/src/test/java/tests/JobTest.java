package tests;


import org.testng.annotations.Test;

import pages.JobPage;

public class JobTest extends ProfileTest{
  @Test(priority=3)
  public void jobs() throws InterruptedException {
	  JobPage ob3=new JobPage(driver);
	  ob3.attendence();
	  ob3.createJob();
 	 
	  
  }
}

