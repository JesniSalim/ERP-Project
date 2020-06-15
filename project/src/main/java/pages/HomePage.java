package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement s1;
	@FindBy(xpath="//a[@href='/erp/user/profile']")
	WebElement s2;
	@FindBy(xpath="//h1['ERP | Dashboard']")
	WebElement text;
	public void HomeClick() throws InterruptedException
	{
		s1.click();
		Thread.sleep(1000);
		s2.click();
		Thread.sleep(1000);
	
	}
	
	public  HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}



