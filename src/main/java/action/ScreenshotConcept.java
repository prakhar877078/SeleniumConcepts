package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotConcept {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://app.hubspot.com/login");
		
		takePageScreeshot(driver, "login");
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		takeElementScreeshot(emailId,  "email");
		takeElementScreeshot(password,  "password");
		takeElementScreeshot(loginButton,  "loginButton");

	}
	
	public static void takePageScreeshot(WebDriver driver, String fileName) {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcfile, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void takeElementScreeshot(WebElement element, String fileName) {
		File srcfile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcfile, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
