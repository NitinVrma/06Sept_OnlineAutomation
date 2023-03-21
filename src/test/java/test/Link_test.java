package test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.Baselibrary;
import pages.Link_page;


public class Link_test  extends Baselibrary{
	
	Link_page ob;
	
	@BeforeTest
	public void  getLaunchtestingBaba()
	{
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob= new Link_page();

	}
	@Test(priority = 0)
	public void clickOnElement()
	{
		ob.clickOnElement();
	}
	@Test(priority = 1)
	public void clickOnlinkbutton() {
		ob.clickOnlinkbutton();
	}
	@Test(priority = 2)
	public void clickOnDemopage() throws InterruptedException {
		Thread.sleep(2000);
		ob.clickOnDemopage();
		switchtotab(1);
		driver.close();
		switchtotab(0);
	}

}
