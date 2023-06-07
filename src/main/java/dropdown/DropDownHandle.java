package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		 WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		 WebElement year = driver.findElement(By.id("year"));

			/*
			 * Select select = new Select(day); select.selectByVisibleText("5");
			 * 
			 * Select select1 = new Select(month); select1.selectByVisibleText("May");
			 * 
			 * Select select2 = new Select(year); select2.selectByVisibleText("2012");
			 */

		selectValueFromDropDown(day,"5");
		selectIndexFromDropDown(month,5);
		selectValueFromDropDown(year,"2012");

		 
	}
	
	
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectIndexFromDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
