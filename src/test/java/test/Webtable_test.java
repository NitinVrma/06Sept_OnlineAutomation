package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.Baselibrary;
import pages.Webtable_page;

public class Webtable_test extends Baselibrary {
	Webtable_page ob;
	@BeforeTest
	public void getLaunchtestingbaba()
	{
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new Webtable_page();
	}
	
	@Test(priority = 0)
	public void clickOnElement()
	{
		ob.clickonelement();
	}
	@Test(priority=1)
	public void clickOnwebtable()
	{
		ob.clickonwebtable();
		
	}
	@Test(priority=2)
	public void filldetails()
	{
		ob.filldetails();
		
	}
}
