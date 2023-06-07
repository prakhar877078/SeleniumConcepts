package syncandwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Util;

public class EXplicitWaitUsingCustom {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
        Util util = new Util(driver);

        driver.get("https://app.hubspot.com/login");
        String title = util.waitForElementTitle("Login", 5);
        System.out.println(title);

        
        By emailId = By.id("username");
        By password = By.id("password");
        By loginBtn = By.id("loginBtn");
        
        
        util.waitForElement(emailId, 15).sendKeys("naveen@gmail.com");
        util.doSendKeys(password, "Test@123");
        
        util.waitForElement(loginBtn, 6).click();
        
        
		
	}

}
