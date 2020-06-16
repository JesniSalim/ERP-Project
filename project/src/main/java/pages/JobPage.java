package pages;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class JobPage {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='fa fa-calendar']")
	WebElement calender;
	@FindBy(xpath="//a[text()='Attendance']")
	WebElement atten;
	@FindBy(xpath="//span[@title='Select date']")
	WebElement date ;
	@FindBy(xpath="//th[@class='datepicker-switch']")
			WebElement year;	
	@FindBy(xpath="//span[@class='month']")
	List<WebElement> month;	
	@FindBy(xpath="//td[@class='day']")
	List<WebElement> day;
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement start;
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[3]")
	WebElement calen;
	public void attendence() throws InterruptedException
	{
		calen.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Thread.sleep(1000);
		atten.click();
		Thread.sleep(1000);
		date.click();
		Thread.sleep(1000);
		year.click();
		Thread.sleep(1000);
		month.get(3).click();
		Thread.sleep(2000);
        day.get(5).click();
		Thread.sleep(5000);
		start.click();
		Thread.sleep(5000);
	}
	@FindBy(xpath="//a[text()='Job']")
	WebElement jb;
	@FindBy(xpath="//a[@class='btn btn-success']")
	WebElement crjob;
	@FindBy(xpath="//input[@id='job-title']")
	WebElement jobtitle;
	@FindBy(xpath="//span[@id='select2-job-client_id-container']")
	WebElement client;
	@FindBy(xpath="//li[@class='select2-results__option']")
	WebElement cl;
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement search;
	@FindBy(xpath="//input[@id='job-po']")
	WebElement po;
	@FindBy(xpath="//textarea[@id='job-description']")
	WebElement description;
	@FindBy(xpath="//select[@id='job-type']")
	WebElement jobtype;
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement save;
public void createJob() throws InterruptedException
{  
	calender.click();
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
Thread.sleep(500);
	jb.click();
	Thread.sleep(1000);
	crjob.click();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	Thread.sleep(1000);
	jobtitle.click();
	Thread.sleep(1000);
	jobtitle.sendKeys("Program Analyst");
	Thread.sleep(1000);
	client.click();
	Thread.sleep(1000);
	cl.click();
	Thread.sleep(1000);
//    search.sendKeys("Client1");
//	Thread.sleep(1000);
	
	Select type=new Select(jobtype);
	type.selectByIndex(1);
	Thread.sleep(2000);
	po.click();
	po.sendKeys("jdndnk");  
	description.click();
	description.sendKeys("maintain and update database");
	Thread.sleep(1000);
	//save.click();
	Thread.sleep(1000);
	//test
}
public JobPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}

