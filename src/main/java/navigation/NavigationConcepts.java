package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();// topcasting this line will launch the browser
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
        driver.navigate().back();
		System.out.println(driver.getTitle());
        driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

		driver.quit();
		
		
	}

}
