package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	@BeforeTest

	  public void beforeTest() throws InterruptedException {
//		  System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
//			driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://qabible.in/erp/login");
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Thread.sleep(1000);
	}


	@AfterTest
	public void afterTest() {
	  driver.close();}
	}




