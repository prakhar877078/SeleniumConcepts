package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Util;

public class LoginPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		//Thread.sleep(5000);
		
		//page objects:
		By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
		Util util = new Util(driver);
		
		util.doSendKeys(emailId, "abc@gmail.com");
		util.doSendKeys(password, "12345");
		util.doClick(loginButton);
		
	}

}
