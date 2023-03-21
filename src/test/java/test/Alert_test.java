package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.Baselibrary;
import pages.Alert_page;


public class Alert_test extends Baselibrary {
	
  Alert_page ob;
	
	@BeforeTest
	public void  getLaunchtestingBaba()
	{
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob= new Alert_page();

	}
	@Test(priority = 1)
	public void clickonalertframe() {
		ob.clickonalertframe();
	}
	@Test(priority = 2)
	public void clickonalerts() {
		ob.clickonalerts();
	}
	@Test(priority = 3)
	public void clickme1alert()throws InterruptedException {
		ob.clickme1alert();
	}

}
