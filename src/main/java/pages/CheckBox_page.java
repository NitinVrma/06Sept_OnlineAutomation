package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.Baselibrary;

public class CheckBox_page extends Baselibrary{
	public CheckBox_page()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement elementbutton;
	@FindBy(xpath="//*[text()='check box']")
	private WebElement checkBoxButton;
	@FindBy(xpath ="//*[@id='myCheck']")
	private WebElement mobilecheckboxButton;
	@FindBy(xpath ="//*[@id='tab_2']/div/iframe")
	private WebElement frame; 
	@FindBy(xpath ="//*[@id='mylaptop']")
	private WebElement laptopcheckboxbutton;
	@FindBy (xpath ="//*[@id='mydesktop']")
	private WebElement desktopcheckboxButton;
	@FindBy (xpath ="//*[@id=\'text\']")
	private WebElement mobiletext;
	public void clickOnElementButton()
	{
		elementbutton.click();
	}
	public void clickOnCheckBoxButton()
	{
		checkBoxButton.click();
	}
	public void clickOnmobilecheckboxButton()
	{
		driver.switchTo().frame(frame);
		mobilecheckboxButton.click();String text =mobiletext.getText();
		Assert.assertEquals(text, "You are selected Mobile");
		driver.switchTo().defaultContent();
		
	} 	
	public void clickOnlaptopcheckboxbutton()
	{
		driver.switchTo().frame(frame);
		laptopcheckboxbutton.click();
		driver.switchTo().defaultContent();
	} 	

	public void clickOndesktopcheckboxButton()
	{
		driver.switchTo().frame(frame);
		desktopcheckboxButton.click();
		driver.switchTo().defaultContent();
	} 	
	
	

}


