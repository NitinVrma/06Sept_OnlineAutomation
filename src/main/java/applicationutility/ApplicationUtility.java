package applicationutility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	
	public void doubleClick(WebElement ele);
	public void rightclick(WebElement ele);
	public void clicktext(WebElement ele);
	public void switchtotab(int tabindex );
	public void fileuploading(String path); 

}
