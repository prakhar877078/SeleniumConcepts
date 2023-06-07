package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DropDownUtil {

	/**
	 * This is a method to select value from dropdown using selectByVisibleText
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	
	/**
	 * This is a method to select value from dropdown using selectByIndex
	 * @param element
	 * @param index
	 */
	public static void selectIndexFromDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	
	/**
	 * This is a method to select value from dropdown
	 * @param element
	 */
	public static void getDropDownValues(WebElement element) {
		Select select = new Select(element);
		 
		 List<WebElement> droplist = select.getOptions();
		 System.out.println("total number of values in dropdown : "+droplist.size());
		 
		 for(int i=0; i<droplist.size(); i++) {
			 String text = droplist.get(i).getText();
			 System.out.println(text);
		
	}
		 
}		 
	
	
		 public static ArrayList<String> getDropDownValuesUsingArrList(WebElement element) {
				Select select = new Select(element);
				 
				 List<WebElement> droplist = select.getOptions();
				 System.out.println("total number of values in dropdown : "+droplist.size());
				 ArrayList<String>ar = new ArrayList<String>();
				 for(int i=0; i<droplist.size(); i++) {
					 String text = droplist.get(i).getText();
					 ar.add(text);
			}	 
				 return ar;
}
		 
	/**
	 * This method is used to select values from dropdown without using select class 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	 public static void selectDropDownValueWithoutSelect(WebDriver driver, String locator, String value) {
		 List<WebElement> dayslist = driver.findElements(By.xpath(locator));
		 System.out.println(dayslist.size());
		 
		 for(int i=0; i<dayslist.size(); i++) {
			 String text = dayslist.get(i).getText();
			 System.out.println(text);
			 if(text.equals(value)) {
				 dayslist.get(i).click();
				 break;
			 }
		 }
	 }
}
