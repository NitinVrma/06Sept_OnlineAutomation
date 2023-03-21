package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.Baselibrary;
import pages.CheckBox_page;

public class CheckBox_test extends Baselibrary {
	
	CheckBox_page ob;
	@Parameters("env")
	@BeforeTest
	public void getLaunchtestingbaba(String env)
	{
		getLaunchUrl(getReadData(env));
		ob = new CheckBox_page();
	}
	@Test(priority = 1)
	public void clickOnElementButton() {
		ob.clickOnElementButton();
	}
	@Test(priority = 2)
	public void clickOnCheckBoxButton() {
		ob.clickOnCheckBoxButton();
	}
	@Test(priority = 3)
	public void clickOnmobilecheckboxButton() {
		ob.clickOnmobilecheckboxButton();
		
	}
	@Test(priority = 4)
	public void clickOnlaptopcheckboxbutton() {
		ob.clickOnlaptopcheckboxbutton();
		
	}@Test(priority = 5)
	public void clickOndesktopcheckboxButton() {
		ob.clickOndesktopcheckboxButton();
		
	}
}
