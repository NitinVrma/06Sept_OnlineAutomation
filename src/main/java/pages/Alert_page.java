package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.Baselibrary;

public class Alert_page extends Baselibrary {
	

	public Alert_page() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//*[@data-target='#alerts']")
	private WebElement alertframe;
	@FindBy(xpath = "//*[text()='alerts']")
	private WebElement alerts;
	@FindBy(xpath = "(//*[text()='Click me'])[1]")
	private WebElement clickme1alert;
	
	public void clickonalertframe() {
		alertframe.click();
	}
	public void clickonalerts() {
		alerts.click();
	}
	public void clickme1alert() throws InterruptedException {
		elementtobeclickable(clickme1alert, 5);
		clickme1alert.click();
		driver.switchTo().alert().accept();
	
	}

}
