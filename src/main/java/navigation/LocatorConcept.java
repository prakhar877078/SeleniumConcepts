package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  id name xpath Css Selector Class Name Link Text partial link text
 */

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();// topcasting this line will launch the browser
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.quit();
		
	}

}
