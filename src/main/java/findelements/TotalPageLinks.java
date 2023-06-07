package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*findElememts() is used for finding multiple kinds of similar elements*/

public class TotalPageLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links :"+linklist.size());
		
		for(int i=0; i<linklist.size(); i++) {
			String text = linklist.get(i).getText();
			System.out.println(text);
		}
		
		driver.quit();
		
	}

}

/* Assignment : Print all the links which are only having text */
