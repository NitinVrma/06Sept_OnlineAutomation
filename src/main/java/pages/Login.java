package pages;


import baseLibrary.Baselibrary;

	public class Login extends Baselibrary {
		
	
	
	public void getVerifyTitle()
	{
		String title = driver.getTitle();
		System.out.println("Title is :" + title);
	}
	
	
}
