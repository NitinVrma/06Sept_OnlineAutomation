package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.Baselibrary;
import pages.TextBox_Page;

	public class TextBox_test extends Baselibrary {
	
	TextBox_Page ob;
	
	@BeforeTest
	public void getLaunchtestingbaba()
	{
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob = new TextBox_Page();
	}
	@Test(priority = 0)
	public void clickOnElement()
	{
		ob.clickOnElement();
	}
	@Test(priority = 1)
	public void clickonTextBoxbutton()
	{
		ob.clickonTextBoxbutton();
	}
	@Test(priority = 2)
	public void sendTextfullname()
	{
		ob.filldetails();
	}
	@Test(priority = 3)
	public void getVerifyDetails() {
		ob.getVerifyDetails();
	}

	/*@Test(priority = 3)
	public void sendTextfullemail() {
		ob.sendTextfullemail();
	}

	@Test(priority = 4)
	public void sendTextcurrentaddress() {
		ob.sendTextcurrentaddress();

	}

	@Test(priority = 5)
	public void sendTextpermanentaddress()
	{
		ob.sendTextpermanentaddress();

	}*/
	
	
	
}
	
