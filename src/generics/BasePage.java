package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public void dropdownbyvisibletext(WebElement ele, String text)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void dropdownbyvalue(WebElement ele, String val)
	{
		Select sel = new Select(ele);
		sel.selectByValue(val);
	}
	
	public void dropdownbyindex(WebElement ele, int ind)
	{
		Select sel = new Select(ele);
		sel.selectByIndex(ind);
	}

}
