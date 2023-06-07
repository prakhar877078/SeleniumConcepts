package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Using action class how to enter a value in a text field

public class ActionEvents {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/account/login");
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		action.sendKeys(emailId, "abc@gmail.com").build().perform();
		action.sendKeys(password, "12345").build().perform();
		action.click(loginButton).build().perform();

	}

}
