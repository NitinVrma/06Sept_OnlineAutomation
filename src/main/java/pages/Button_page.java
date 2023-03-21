package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.Baselibrary;

public class Button_page extends Baselibrary {
	
	public Button_page() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement elementbutton;
	@FindBy(xpath = "(//*[@id=\"v-pills-tab\"]/a[5])[1]")
	private WebElement button;
	@FindBy(xpath = "//*[@ondblclick='doubletext()']")
	private WebElement doubleclick;
	@FindBy(xpath = "//*[@oncontextmenu='righttext()']")
	private WebElement rightclick;
	@FindBy(xpath = "//*[@onclick='clicktext()']")
	private WebElement clicktext;
	public void  clickOnElement ()
	{
		elementbutton.click();
	}
	public void clickOnButton() {
		button.click();
	}
	
	public void doubleclick() {
		doubleClick(doubleclick);
	}
	public void rightclick() {
		rightclick(rightclick);
	}
	public void clicktest() {
		clicktext(clicktext);
	}
}

