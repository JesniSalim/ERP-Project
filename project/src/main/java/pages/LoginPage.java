package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement user;
	@FindBy(xpath="//input[@id='loginform-password']")
	  WebElement pass;
	
@FindBy(xpath="//button[@name='login-button']")
WebElement login;
	  public void loginDetails() throws InterruptedException
		{
		  user.sendKeys("vinod");
		  pass.sendKeys("1q2w3e4r");
		  Thread.sleep(2000);
		  login.click();
		  Thread.sleep(2000);

}

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

}



