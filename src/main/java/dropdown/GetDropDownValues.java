package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDropDownValues {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		 WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		 WebElement year = driver.findElement(By.id("year"));

			
			/*
			 * Select select = new Select(day);
			 * 
			 * List<WebElement> dayslist = select.getOptions();
			 * System.out.println("total days: "+dayslist.size());
			 * 
			 * for(int i=0; i<dayslist.size(); i++) { String text =
			 * dayslist.get(i).getText(); System.out.println(text);
			 * 
			 * }
			 */
		 
		 getDropDownValues(day);
		 getDropDownValues(month);
		 getDropDownValues(year);
		 
			
			  ArrayList<String> daylist = DropDownUtil.getDropDownValuesUsingArrList(day);
			  System.out.println(daylist);
			  ArrayList<String> monthlist = DropDownUtil.getDropDownValuesUsingArrList(month);
			  System.out.println(monthlist);
			  ArrayList<String> yearlist = DropDownUtil.getDropDownValuesUsingArrList(year);
			  System.out.println(yearlist);

		 
		 driver.quit();
	}

	//Generic method for dropdown list
	
	public static void getDropDownValues(WebElement element) {
		Select select = new Select(element);
		 
		 List<WebElement> droplist = select.getOptions();
		 System.out.println("total number of values in dropdown : "+droplist.size());
		 
		 for(int i=0; i<droplist.size(); i++) {
			 String text = droplist.get(i).getText();
			 System.out.println(text);
		
	}
		 
		 
}
}

