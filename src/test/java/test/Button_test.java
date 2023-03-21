package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.Baselibrary;
import pages.Button_page;

public class Button_test extends Baselibrary {
	Button_page ob;
		
		@BeforeTest
		public void  getLaunchtestingBaba()
		{
			getLaunchUrl("https://www.testingbaba.com/old/");
			ob= new Button_page();

		}
		@Test(priority = 0)
		public void clickOnElement()
		{
			ob.clickOnElement();
		}
		@Test(priority = 1)
		public void clickOnButton() {
			ob.clickOnButton();
		}
		@Test(priority = 2)
		public void doubleclick()
		{
			ob.doubleclick();
		}
		@Test(priority = 3)
		public void rightclick()
		{
			ob.rightclick();
			
		}
		@Test(priority = 4)
		public void clicktext() {
			ob.clicktest();
			
		}
		
}