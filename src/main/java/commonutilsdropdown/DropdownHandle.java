package commonutilsdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {


		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		
//		Select select1 = new Select(driver.findElement(country));
//		select1.selectByVisibleText("India");	
		
		//doSelectByVisibleText(country,"India");
		selectDropDownValue(country,1,"5");
		//selectDropDownValue(country,Dropdown.INDEX,"5");

		
	}
	
	// can we merge all three methods in one
	
	public static void selectDropDownValue(By locator, int type, String value) {
		Select select = new Select(getElement(locator));
		
		switch (type) {
		case 1:
			select.selectByIndex(Integer.parseInt(value));
			break;
			
		case 2:
			select.selectByValue(value);
			break;
			
		case 3:
			select.selectByVisibleText(value);
			break;
			
		default:
			System.out.println("please pass a correct value");
			break;
		}
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public static void doSelectByVisibleValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectByVisibleIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	
}
