package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.Baselibrary;
import junit.framework.Assert;
	
	public class TextBox_Page extends Baselibrary {
		public static String path = "C:\\Users\\Himanshu\\eclipse-workspace\\06Sept_OnlineAutomationBatch\\testdata\\ExcelData.xlsx";
	public TextBox_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement elementbutton;
	@FindBy(xpath="//*[@href='#tab_1']")
	private WebElement textBoxbutton;
	@FindBy(xpath="//*[@id='fullname1']")
	private WebElement fullname1;
	@FindBy(xpath="//*[@id='fullemail1']")
	private WebElement fullemail1;
	@FindBy(xpath="//*[@id='fulladdresh1']")
	private WebElement currentaddress;
	@FindBy(xpath="//*[@id='paddresh1']")
	private WebElement permanentaddress;
	@FindBy(xpath="//*[@onclick='return validateform()']")
	private WebElement submitbutton;
	@FindBy(xpath="//*[@class='col-md-6 mt-5']/label")
	private List <WebElement> actualdata;
 	public void  clickOnElement ()
	{
		elementbutton.click();
	}
	public void clickonTextBoxbutton() {
		textBoxbutton.click();
	}
	public void filldetails() {
		fullname1.sendKeys(getReaddata(path,0,0,1));
		fullemail1.sendKeys(getReaddata(path,0,1,1));
		currentaddress.sendKeys(getReaddata(path,0,2,1));
		permanentaddress.sendKeys(getReaddata(path,0,3,1));
		submitbutton.click();
	}
		// THIS METHOD IS USED TO GET FULL DATA FROM LIST OF WEBELEMET
		 /*  public void getVerifyDetails() {
			for (WebElement dd: actualdata)
			{
			System.out.println(dd.getText());
			}*/
	// THIS METHOD IS USED TO GET PARTICULAR DATA FROM THE LIST OF WEBELEMENT
		/*public void getVerifyDetails() {
			for (int i=1;i<=actualdata.size()-1;i++ )
			{
				String data =actualdata.get(i).getText();
				System.out.println(data);
				i++;
			}
		}*/
	// THIS METHOD IS USED TO VERIFY DATA BY SOFT ASSERT
		public void getVerifyDetails() {
			
			SoftAssert asertt = new SoftAssert();
			int j=0; 
			for (int i=1;i<=actualdata.size()-1; i=i+2 )
			{	
				//Assert.assertEquals(false, true);
				String data =actualdata.get(i).getText();
				System.out.println(data);
				asertt.assertEquals(data, getReaddata(path,0,j,1));
				j++;
			}
			asertt.assertAll();
		}
}
