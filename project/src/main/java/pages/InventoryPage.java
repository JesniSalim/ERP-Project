package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
	WebDriver driver;
	@FindBy(xpath="//i[@class='fa fa-cubes']")
	WebElement invent;
	@FindBy(xpath="//a[text()='Product']")
	WebElement prdct;
	@FindBy(xpath="//a[@class='btn btn-success']")
	WebElement cprdct;
	@FindBy(xpath="//input[@id='product-name']")
	WebElement prdctName;
	@FindBy(xpath="//input[@id='product-stock']")
	WebElement stock;
	@FindBy(xpath="//input[@id='product-code']")
	WebElement code;
	@FindBy(xpath="//select[@id='product-unit']")
	WebElement unit;
	@FindBy(xpath="//select[@id='product-type']")
	WebElement type;
	@FindBy(xpath="//input[@id='product-yom']")
	WebElement manufacture;
	@FindBy(xpath="//input[@id='product-tax']")
	WebElement tax;
	@FindBy(xpath="//input[@id='product-price']")
	WebElement price;
	@FindBy(xpath="//input[@id='product-status']")
	WebElement status;
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement save;
	public void product() throws InterruptedException
	{
		invent.click();
		prdct.click();
		Thread.sleep(1000);
		cprdct.click();
		Thread.sleep(1000);
	}
	public void createProduct() throws InterruptedException
	{
		prdctName.click();
		prdctName.sendKeys("pendrive");
		Thread.sleep(1000);
		stock.click();
		stock.sendKeys("1000");
		Thread.sleep(1000);
		code.click();
		code.sendKeys("1234");
		Thread.sleep(1000);
		Select un=new Select(unit);
		un.selectByIndex(1);
		Thread.sleep(1000);
		Select ty=new Select(type);
		ty.selectByIndex(1);
		Thread.sleep(1000);
		manufacture.click();
		manufacture.sendKeys("0019");
		Thread.sleep(1000);
		tax.click();
		tax.sendKeys("3");
		Thread.sleep(1000);
		price.click();
		price.sendKeys("600");
		Thread.sleep(1000);
		Boolean s=status.isSelected();
		if(s=false)
		{
			status.click();
			Thread.sleep(1000);
		}
		
     	save.click();
		Thread.sleep(1000);
	}
	@FindBy(xpath="//a[text()='Supplier']")
	WebElement sup;
	@FindBy(xpath="//a[text()='Create Supplier']")
	WebElement crSup;
	@FindBy(xpath="//input[@id='supplier-name']")
	WebElement supName;
	@FindBy(xpath="//input[@id='supplier-address1']")
	WebElement add1;
	@FindBy(xpath="//input[@id='supplier-address2']")
	WebElement add2;
	@FindBy(xpath="//input[@id='supplier-phone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='supplier-mobile']")
	WebElement mobile;
	@FindBy(xpath="//input[@id='supplier-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='supplier-gstno']")
	WebElement gstno;
	@FindBy(xpath="//input[@id='supplier-city']")
	WebElement city;
	@FindBy(xpath="//input[@id='supplier-state']")
	WebElement state;
	@FindBy(xpath="//input[@id='supplier-zip']")
	WebElement zip;
	@FindBy(xpath="//input[@id='supplier-account_name']")
	WebElement acName;
	@FindBy(xpath="//input[@id='supplier-ac_no']")
	WebElement acNum;
	@FindBy(xpath="//input[@id='supplier-re_ac_no']")
	WebElement reacNum;
	@FindBy(xpath="//input[@id='supplier-ifsc']")
	WebElement ifsc;
	@FindBy(xpath="//input[@id='supplier-bank_name']")
	WebElement bnkname;
	@FindBy(xpath="//input[@id='supplier-bank_branch']")
	WebElement brnch;
	@FindBy(xpath="//input[@id='supplier-status']")
	WebElement status1;
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement submit;
	
	public void supplier() throws InterruptedException
	{
	invent.click();
	Thread.sleep(1000);
	sup.click();
	Thread.sleep(1000);
	crSup.click();
	Thread.sleep(1000);
	supName.click();
	supName.sendKeys("abc1");
	Thread.sleep(1000);
	add1.click();
	add1.sendKeys("Trivandrum");
	Thread.sleep(1000);
	add2.click();
	add2.sendKeys("Kerala");
	Thread.sleep(1000);
	phone.click();
	phone.sendKeys("0471 2589746");
	Thread.sleep(1000);
	mobile.click();
	mobile.sendKeys("9986541236");
	Thread.sleep(1000);
	email.click();
	email.sendKeys("hsd@gmail.com");
	Thread.sleep(1000);
	gstno.click();
	gstno.sendKeys("1122345");
	Thread.sleep(1000);
	city.click();
	city.sendKeys("Tvm");
	Thread.sleep(1000);
	state.click();
	state.sendKeys("kerala");
	Thread.sleep(1000);
	zip.click();
	zip.sendKeys("695114");
	Thread.sleep(1000);
	acName.click();
	acName.sendKeys("xyz");
	Thread.sleep(1000);
	acNum.click();
	acNum.sendKeys("11236459783");
	Thread.sleep(1000);
	reacNum.click();
	reacNum.sendKeys("11236459783");
	Thread.sleep(1000);
	ifsc.click();
	ifsc.sendKeys("NBCD0000123");
	Thread.sleep(1000);
	bnkname.click();
	bnkname.sendKeys("Axis Bank");
	Thread.sleep(1000);
	brnch.click();
	brnch.sendKeys("Tvm");
	Thread.sleep(1000);
	Boolean st=status1.isEnabled();
	System.out.println(st);
	if(st=false) {
	status1.click();
	}
	Thread.sleep(1000);
	submit.click();
	}
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}

