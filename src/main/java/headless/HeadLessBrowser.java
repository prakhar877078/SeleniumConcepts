package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		//headless : no ui
		//testing is happening behind the scene
		//faster than normal ui mode
		
		/*
		 * ChromeOptions co = new ChromeOptions(); 
		 * co.addArguments("--headless");
		 * 
		 * WebDriver driver = new ChromeDriver(co);
		 * 
		 * driver.get("http://www.google.com"); 
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 */
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("http://www.google.com"); 
		System.out.println(driver.getTitle());
	}

}
