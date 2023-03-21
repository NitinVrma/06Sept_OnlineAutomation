package baseLibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import applicationutility.ApplicationUtility;
import excelutility.ExcelUtility;
import propertyUtility.PropertyUtility;
import waitUtility.WaitUtility;


	public class Baselibrary implements ExcelUtility,PropertyUtility,ApplicationUtility,WaitUtility {
	 String path ="C:\\Users\\Himanshu\\eclipse-workspace\\06Sept_OnlineAutomationBatch\\testdata\\config.properties";
		public static WebDriver driver;
		
		public void	getLaunchUrl(String url)	
		{	
			String value = "C:\\Users\\Himanshu\\eclipse-workspace\\06Sept_OnlineAutomationBatch\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", value);
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[text()='×']")).click();
			driver.findElement(By.xpath("//*[text()='Practice']")).click();	
		}
		
		  @AfterTest public void tearDown()
		  {
			  driver.quit(); 
		  //quit is used to to allpages on browser colsed all in once & close is used to close current pages 
		  }
		 
		
		@Override
		public String getReaddata(String path, int sheetno, int colno, int rowno)
		{
			String value = "" ;
			try {
				FileInputStream fis = new FileInputStream(path);
				 XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sheet = wb.getSheetAt(sheetno);
						value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
			} catch (Exception e) {
				System.out.println("Issue in get data ");
			}
			return value;
		}
		@Override
		public String getReadData( String key ) {
			String value = "" ;
			try {
				FileInputStream fis = new FileInputStream(path);
				Properties prop = new Properties();
				prop.load(fis);
				value = prop.getProperty(key);
				
			} catch (Exception e) {
				System.out.println("Issue in get Data from property file ");
			}
			return value;
		}
		@Override
		public void doubleClick(WebElement ele) {
			Actions act =new Actions(driver);
		act.doubleClick(ele).perform();
		}
		@Override
		public void rightclick(WebElement ele) {
			Actions act =new Actions(driver);
		act.contextClick(ele).perform();
		}
		@Override
		public void clicktext(WebElement ele) {
			Actions act =new Actions(driver);
		act.click(ele).perform();
		}

		@Override
		public void switchtotab(int tabindex) {
			Set<String> set = driver.getWindowHandles();
			ArrayList<String> li = new ArrayList<String>(set);
			driver.switchTo().window(li.get(tabindex));			
		}

		@Override
		public void elementtobeclickable(WebElement ele, int time) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		}

		@Override
		public void fileuploading(String path) {
			try {
				
				StringSelection sel = new StringSelection(path);
				Clipboard tool = Toolkit.getDefaultToolkit().getSystemClipboard();
				tool.setContents(sel, null);
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.delay(500);
				robot.keyRelease(KeyEvent.VK_ENTER);
				} catch (Exception e) {
					System.out.println("issue in file");
			}
			
			
		}
		
}
