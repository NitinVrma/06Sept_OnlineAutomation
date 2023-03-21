package test;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;	
	import baseLibrary.Baselibrary;
	import pages.Login;
	
		public class LoginTest extends Baselibrary {
			Login ob;
			
			@BeforeTest
			public void  getLaunchtestingBaba()
			{
				getLaunchUrl("https://www.testingbaba.com/old/");
				ob= new Login();
	
			}
			@Test(priority = 0)
			public void getTitle()
			{
				ob.getVerifyTitle();
			}

	
}
