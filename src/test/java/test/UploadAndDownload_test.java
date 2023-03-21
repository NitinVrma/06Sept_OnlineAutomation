package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.Baselibrary;
import pages.UploadAndDownload_page;


public class UploadAndDownload_test extends Baselibrary {

	UploadAndDownload_page ob;
	
	@BeforeTest
	public void  getLaunchtestingBaba()
	{
		getLaunchUrl("https://www.testingbaba.com/old/");
		ob= new UploadAndDownload_page();
	}
	
	@Test(priority = 0)
	public void clickOnElement() {
		ob.clickOnElement();
		}
	@Test(priority = 1)
	public void clickonuploaddownload() {
		ob.clickonuploaddownload();
	}
	@Test(priority = 2)
	public void clickonchose() {
		ob.clickonchose();
	}
}
