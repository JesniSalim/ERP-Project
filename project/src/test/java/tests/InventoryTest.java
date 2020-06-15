package tests;

import org.testng.annotations.Test;

import pages.InventoryPage;

public class InventoryTest extends EmployeeTest{
  @Test(priority=5)
  public void inventory() throws InterruptedException {
	  InventoryPage ob4=new InventoryPage(driver);
	  ob4.product();
	  ob4.createProduct();
	  ob4.supplier();
  }
}
