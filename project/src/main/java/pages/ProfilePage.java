package pages;

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class ProfilePage {
		WebDriver driver;
		@FindBy(xpath="//input[@id='profileform-phone']")
		WebElement phne;
		@FindBy(xpath="//input[@id='profileform-username']")
		WebElement username;
		@FindBy(xpath="//select[@id='profileform-company_id']")
		WebElement cmpny;
		@FindBy(xpath="//input[@type='checkbox']")
		List<WebElement> branch;
		@FindBy(xpath="//button[@type='submit']")
		WebElement save;
		public void profileDetails() throws InterruptedException
		{   
			Thread.sleep(1000);
			phne.clear();
			phne.sendKeys("9947074521");
			Thread.sleep(1000);
			username.clear();
			username.sendKeys("vinod");
			Thread.sleep(1000);
			Select d=new Select(cmpny);
			d.selectByIndex(0);
			Thread.sleep(1000);
			branch.clear();
			branch.get(5).click();
			Thread.sleep(2000);
			save.click();
			Thread.sleep(5000);
			
			
		}
		public ProfilePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

	}


