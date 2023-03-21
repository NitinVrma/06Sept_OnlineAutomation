package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.Baselibrary;

public class Webtable_page extends Baselibrary{
	
	public Webtable_page()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement elementbutton;
	@FindBy(xpath="//*[text()='web tables']")
	private WebElement webtablebutton;
	@FindBy(xpath ="//*[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement nametextbox;
	@FindBy(xpath="//*[@name='email']")
	private WebElement emailtextbox;
	@FindBy(xpath="//*[text()='Save']")
	private WebElement savebutton;
	@FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
	private WebElement  frame;
	public void clickonelement()
	{
		elementbutton.click();
	}
	public void clickonwebtable()
	{
		webtablebutton.click();
	}
		
		public void filldetails() {
			driver.switchTo().frame(frame);
			nametextbox.sendKeys("ajay");
			emailtextbox.sendKeys("ajay@gmail.com");
			savebutton.click();
			nametextbox.sendKeys("vijay");
			emailtextbox.sendKeys("vijay@gmail.com");
			savebutton.click();
			nametextbox.sendKeys("sanjay");
			emailtextbox.sendKeys("sanjay@gmail.com");
			savebutton.click();
			nametextbox.sendKeys("dhananjay");
			emailtextbox.sendKeys("dhananjay@gmail.com");
			savebutton.click();
			driver.switchTo().defaultContent();
		}
		
}

