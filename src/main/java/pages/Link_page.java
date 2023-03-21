package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.Baselibrary;

public class Link_page  extends Baselibrary{

	public Link_page() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement elementbutton;
	@FindBy(xpath = "//*[text()='links']")
	private WebElement linkbutton;
	@FindBy(xpath = "//*[text()='Demo Page']")
	private WebElement demopage;
	public void  clickOnElement ()
	{
		elementbutton.click();
	}
	public void clickOnlinkbutton()
	{
		linkbutton.click();
	}
	public void clickOnDemopage() throws InterruptedException  {
		demopage.click();
		
	}
}
