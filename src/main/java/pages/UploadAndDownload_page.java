package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.Baselibrary;

public class UploadAndDownload_page extends Baselibrary {
		String path ="C:\\Users\\Himanshu\\eclipse-workspace\\06Sept_OnlineAutomationBatch\\testdata\\ExcelData.xlsx";
		public UploadAndDownload_page() {
		PageFactory.initElements(driver,this);
		}

		@FindBy(xpath="//*[@data-target='#elements']")
		private WebElement elementbutton;
		@FindBy(xpath = "//*[text()='upload and download']")
		private WebElement uploaddownload;
		@FindBy(xpath = "//*[text()='Select a file']")
		private WebElement clickonchoosefile;
		
		public void  clickOnElement ()
		{
			elementbutton.click();
		}
		public void clickonuploaddownload() {
			uploaddownload.click();
		}
		public void clickonchose() {
			clickonchoosefile.click();
			fileuploading(path);
			
		}
}
